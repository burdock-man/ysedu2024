import {useState} from "react";
import "./App.css";
import Title from "./Title";

function App() {

  // let TITLE = "Hello Korea!!";
  const [title, setTitle] = useState('Hello Korea?');
  const [text, 메서드이름] = useState("");


  const clickHandler = () => {
    setTitle(현재상태값 => 현재상태값 + " and hello again,");
    // 현재 상태값은 prev라고 많이들 씀 ㅇㅇ
    // 이전 상태를 기반으로 변경될0 때 사용
    // console.log(TITLE);
    // console.log("클릭했다.");
  };

  const abcdef = (이벤트객체) => {
    console.log(이벤트객체.target.value);
    메서드이름(이벤트객체.target.value)
  };

  const onReset = () => {
    // setTitle("");
    메서드이름('');
  }



  return (
    <div className="Wraper">
      {/* <h2 className="title">Hello World!!</h2> */}
      <Title title={title} text={text}/>
      <div>
        <input type="text" value={text} onChange={abcdef}/>
        <button conClick={onReset}>초기화</button>
      </div>
      <p><strong>값: {text}</strong></p>
      <button onClick={clickHandler}>change Title</button>
    </div>
  );
}

export default App;

// props란? 부모의 컴포넌트가 자식 컴포넌트에게 넘겨주는 데이터.
// App.js => 부모 컴포넌트
// Title.js => 자식 컴포넌트
// title={"Hello Korea"} => 자식에게 넘겨주는 props
// props는 title 이라는 key값에 App.js에서 전달한 Hello Korea
// 라는 텍스트를 value를 가지는 객체라는걸 확인 가능.