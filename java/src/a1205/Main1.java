package a1205;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<TransAction> transaction = Arrays.asList(
            new TransAction(brian, 2011, 300),
            new TransAction(raoul, 2012, 1000),
            new TransAction(raoul, 2011, 400),
            new TransAction(mario, 2012, 700),
            new TransAction(mario, 2012, 700),
            new TransAction(alan, 2012, 950)
        );
        // brian, mario 거래자 // Cambridge 거래자 근무하는 도시

        // 1. 문제 2011에 발생한 모든 트랜젝션을 찾아 오름차순으로 정렬하시오
        practice1(transaction);

        // 2. 거래자가 근무하는 모든 도시를 중복없이 나열하시오
        practice2(transaction);

        // 3. 캠브릿지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오
        practice3(transaction);

        // 4. 밀라노엔 거래자가 있는가?
        practice4(transaction);

        // 5. 캠브릿지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오.
        practice5(transaction);

        // 6. 모든 거래자의 이름을 알파벳 순으로 정렬하시오.
        practice6(transaction);

        // 7. 전체 트랜잭션 중 최댓값은 얼마인가?
        practice7(transaction);

        // 8. 전체 트랜잭션 중 최소값은 얼마인가?
        practice8(transaction);



            }
            // 2011에 발생한 모든 트랜젝션을 찾아 오름차순으로 정렬하시오
            private static void practice1(List<TransAction> transaction) {
                List<TransAction> result = transaction.stream()
                                                      .filter(t -> 2011 == t.getYear())
                                                      .sorted(Comparator.comparing(TransAction::getValue))
                                                      .collect(Collectors.toList());
                System.out.println();
                System.out.println(result);
                
            }
            // 거래자가 근무하는 모든 도시를 중복없이 나열하시오
            private static void practice2(List<TransAction> transaction) {
                List<String> result = transaction.stream()
                                                 .map((tran) -> tran.getTrader().getCity())
                                                 .distinct()
                                                 .collect(Collectors.toList());
                //tran(transactions) 객체를 입력받아서 
                //.map(Transaction::getTrader) //각 거래에서 거래자 객체를 추출
                //.map(Trader::getCity) //각 거래자에서 도시정보추출
                System.out.println();
                System.out.println(result);
            }
            // 캠브릿지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오
            private static void practice3(List<TransAction> transaction) {
                List<Trader> result = transaction.stream()
                                                 .map(TransAction::getTrader)
                                                 .filter(t -> t.getCity().equals("Cambridge"))
                                                 .distinct()
                                                 .sorted(Comparator.comparing(Trader::getName))
                                                 .collect(Collectors.toList());
                System.out.println();
                System.out.println(result);
            }
            // 밀라노엔 거래자가 있는가?
            private static void practice4(List<TransAction> transaction) {
                Boolean result = transaction.stream()
                                            .anyMatch(tran -> tran.getTrader().getCity().equals("Milan"));
                System.out.println();
                System.out.println(result);
            }
            // 캠브릿지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오.
            private static void practice5(List<TransAction> transaction) {
                List<TransAction> result = transaction.stream()
                                                 .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                                                //  .sorted(Comparator.comparing(t -> t.getTrader().getName()))
                                                 .collect(Collectors.toList());
                System.out.println();
                System.out.println(result);
            }
            // 모든 거래자의 이름을 알파벳 순으로 정렬하시오.
            private static void practice6(List<TransAction> transaction) {
                String result = transaction.stream()
                                           .map(TransAction::getTrader)
                                           .map(Trader::getName)
                                           .distinct()
                                           .sorted()
                                           .collect(Collectors.joining(","));
                System.out.println();
                System.out.println(result);
            }
            // 전체 트랜잭션 중 최댓값은 얼마인가?
            private static void practice7(List<TransAction> transaction) {
                Optional<TransAction> result = transaction.stream()
                                                          .max(Comparator.comparing(TransAction::getValue));
                System.out.println();
                System.out.println(result.get().getValue());
            }
            // 전체 트랜잭션 중 최소값은 얼마인가?
            private static void practice8(List<TransAction> transaction) {
                Optional<TransAction> result = transaction.stream()
                                                          .min(Comparator.comparing(TransAction::getValue));
                System.out.println();
                System.out.println(result.get().getValue());
            }
}
