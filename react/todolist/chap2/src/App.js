import React, { useRef, useState } from "react"
import Header from "./components/Header";
import Editor from "./components/Editor";
import List from "./components/List";
import './App.css'

const mockData = [
  {
    id: 0,
    isDone: false,
    content: "React 공부하기",
    date: new Date().getTime(),
  }, {
    id: 1,
    isDone: false,
    content: "빨래하기",
    date: new Date().getTime(),
  }, {
    id: 2,
    isDone: false,
    content: "노래 연습하기",
    date: new Date().getTime(),
  }
]

function App() {

  const [todos, setTodos] = useState(mockData);
  const idRef = useRef(3); // 초기 번호는 mockData 0, 1, 2 -> 3번부터

  const onCreate = (content) => {
    const newTodo = {
      id: idRef.current++,
      isDone: false,
      content: content,
      date: new Date().getTime(),
    }
    setTodos([newTodo, ...todos]); // ...todos 기존의 목데이터를 뒤에놓고 새로만든 newTodo를 최상위로 추가
  }

  return (
    <div className="App">
      <Header/>
      <Editor onCreate={onCreate}/> {/* onCreate 함수를 props로 전달하여 할일 추가될 수 있도록 */}
      <List todos={todos}/>
    </div>
  )
}

export default App;