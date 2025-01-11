import Hello from "./Hello";
import "./App.css";

function App() {

  const name = "react";
  const style1 = {
    backgroundColor: "teal",
    color: "wheat",
    fontSize: 24, // 기본단위 px
    padding: "1rem", // 다른단위 사용 시 문자열로 선언
  }

  return (
    // <div>처음만들 리액트</div>
    <div>
      <Hello />
      {/* 주석이 이상하게 생겼엉 */}
      <div style={style1}>{name}</div>
      <div className="gray-box"></div> {/* 걍 class도 되긴 하는데 className을 권장함. */}
    </div>
  );
}
export default App;