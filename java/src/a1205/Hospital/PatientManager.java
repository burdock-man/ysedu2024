package a1205.Hospital;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PatientManager {

    Scanner scan = new Scanner(System.in);

    private static ArrayList<Patient> patients; // 환자목록

    public String hospital = "#     #    " + " ###     " + " ####     " + "#####    " + "#####    " + "#####      " + "#        " + "#\n"
                            +"#     #    " + "#   #    " + "#         " + "#   #    " + "  #      " + "  #       " + "# #       " + "#\n"
                            +"#######    " + "#   #    " + "#####     " + "#####    " + "  #      " + "  #      " + "#####      " + "#\n"
                            +"#     #    " + "#   #    " + "    #     " + "#        " + "  #      " + "  #     " + "#     #     " + "#\n"
                            +"#     #    " + " ###     " + "####      " + "#        " + "#####    " + "  #    " + "#       #    " + "#####\n";

        public PatientManager() {
        patients = new ArrayList<>();
        patients.add(new Patient("홍길동", "010-1234-1234", "경기도 성남시", "치과", "12:30"));
        // 더미데이터를 PatientManager() 객체가 생성되면 한개 넣기.
    }

    public void patientAppointment() {
        System.out.println("\n=========== 환자 등록 ===========\n");

        System.out.print("이름 : ");
        String name = scan.next();
        scan.nextLine();

        System.out.print("전화번호(-포함): ");
        String phone = scan.next();
        scan.nextLine();

        System.out.print("주소: ");
        String address = scan.nextLine();

        System.out.print("진료 내용: ");
        String disease = scan.next();
        scan.nextLine();

        System.out.print("예약 시간: ");
        String time = scan.next();
        scan.nextLine();

        patients.add(new Patient(name, phone, address, disease, time));
        System.out.println("\n접수중입니다···.");
        System.out.println("\n" + name + "님, 진료가 접수되었습니다.");
    }

    public void patientPrint() {
        Boolean patientAppoint = false;
        System.out.println("\n=========== 환자 조회 ===========\n");
        System.out.println("등록된 정보를 조회할 환자의 이름 : ");
        String name = scan.next();
        for(Patient list : patients) {
            if(list.getName().equalsIgnoreCase(name)) {
                patientAppoint = true;
                System.out.println("\n등록정보: " + list.getDisease() + " " + list.getTime());
            }
        }
        if(!patientAppoint) {
            System.out.println("\n등록되지 않은 환자입니다.");
            return;
        }
    }

    public void adminMenu() {
        while (true) {
            System.out.println("\n========== 관리자 메뉴 =========\n");
            System.out.println("1. 환자 등록 목록");
            System.out.println("2. 환자 등록 삭제");
            System.out.println("3. 환자 정보 수정");
            System.out.println("4. 메인으로 돌아가기\n");
            System.out.print("입력 > ");
            
            int choice = -1;
            try {
                choice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\n잘못된 입력입니다. 숫자만 입력하세요.");
                scan.next();
                continue;
            }
            switch (choice) {
                case 1:
                    printAll(); // 모든 환자 조회
                    break;
                case 2:
                    cancelAppoint(); //환자 등록 삭제
                    break;
                case 3:
                    updatePatient(); //환자 정보 수정
                    break;
                case 4:
                    return;
                default:
                    System.out.println("\n잘못된 입력입니다. 다시 입력하세요.");
                    break;
            }
        }

    }
    private void printAll() {
        System.out.println("\n======== 환자 등록 목록 ========\n");
        for(Patient patient : patients) {
            System.out.println(patient.toString());
        }
        if(patients.isEmpty()) {
            System.out.println("\n등록되지 않은 환자입니다.");
            return;
        }
        return;
    }
    private void cancelAppoint() {
        System.out.println("\n======== 환자 등록 삭제 ========\n");
        System.out.println("정보를 삭제할 환자 이름 : ");
        System.out.print("입력 > ");
        String cancelName = scan.next();
        Boolean Found = false;
        for(Patient patient : patients) {
            if(patient.getName().equalsIgnoreCase(cancelName)) {
                Found = true;
                System.out.println("\n삭제중입니다.");
                System.out.println("\n" + cancelName + "님의 정보가 삭제되었습니다.");
                patients.remove(patient);
                return;
            }
        }
        if(!Found) {
            System.out.println("\n등록되지 않은 환자입니다.");
            return;
        }
    }
    private void updatePatient() {
        System.out.println("\n======== 환자 정보 수정 ========\n");
        Boolean Found = false;
        System.out.println("정보를 수정할 환자 이름 : ");
        System.out.print("입력 > ");
        String name = scan.next();
        for(Patient list : patients) {
            if(list.getName().equalsIgnoreCase(name)) {
                Found = true;
                System.out.println("\n수정하고 싶은 정보를 선택하세요");
                System.out.println("1. 전화번호 | 2. 주소 | 3. 예약시간");
                System.out.print("입력> ");
                String updateNum = scan.next();
                if(updateNum.equals("1")) {
                    System.out.println("\n전화번호 수정");
                    System.out.print("입력> ");
                    String updatePhone = scan.next();
                    list.setPhone(updatePhone);
                    System.out.println(name + "님의 전화번호가 수정되었습니다.");
                    break;
                } else if(updateNum.equals("2")) {
                    System.out.println("\n주소 수정");
                    System.out.print("입력> ");
                    String updateAsdress = scan.next();
                    list.setPhone(updateAsdress);
                    System.out.println(name + "님의 주소가 수정되었습니다.");
                    break;
                } else if(updateNum.equals("3")) {
                    System.out.println("\n예약시간 수정");
                    System.out.print("입력> ");
                    String updateTime = scan.next();
                    list.setPhone(updateTime);
                    System.out.println(name + "님의 예약시간이 수정되었습니다.");
                } else {
                    System.out.println("\n잘못된 입력입니다. 다시 입력하세요.");
                    break;
                }
            }
        }
        if(!Found) {
            System.out.println("\n등록되지 않은 환자입니다.");
            return;
        }
    }



}
