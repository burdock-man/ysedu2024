import Hello from "./Hello";
import "./App.css";

function App() {
  const name = "react";
  const style1 = {
    backgroundColor: "black",
    color: "aqua",
    fontSize: 24, // 기본단위는 px
    padding:"1rem", // 다른 단위는 ""써서 적어준다.
  }
  return (
    <div>
      <Hello/>
      <Hello
        // 열리는 태그 내부에서는 이렇게 주석을 작성할수 있음
      />
      <input placeholder="뭐요" />
      <div style={style1}>{name}</div>
      {/* 변수를 가져올 땐 {} 중괄호로 감싸야함. */}

      <div className="lime-box">뭐</div>
      {/* 클래스 줄 때 리액트는 클래스네임으로 거시기 해야된다. */}
    </div>

    // 하나일 땐 <div>로 감싸지 않아도 되는데
    // 두개 이상일때 <div>로 감싸지 않으면 난리난다.
    // 굳이 div가 아니라 <> </>로 감싸도 된다.
  );
}

export default App;