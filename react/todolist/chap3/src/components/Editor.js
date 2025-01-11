import React, { useRef, useState } from 'react'
import './Editor.css'

function Editor({onCreate}) {

  const [content, setContent] = useState("");
  const inputRef = useRef(); // input창 접근

  const onChangeContent = (e) => {
    setContent(e.target.value);
  } // 키보드로 입력하는 내용을 업데이트

  const onKeyDown = (e) => {
    if(e.keyCode === 13) {
      onSubmit();
    }
  }

  const onSubmit = () => {
    if(content === "") {
      alert("아무 것도 입력 안했잖슴;;");
      inputRef.current.focus();
      // 아무것도 입력이 안되면 현재창에 포커스 (클릭해서 깜빡이게)
      // 입력이 안됐으니 입력하세요.
      return;
    }
    onCreate(content);
    console.log("추가된 할일 : " + content);
    inputRef.current.focus();
    setContent("");
  }

  return (
    <div className='Editor'>
        <input 
        ref={inputRef}
        value={content}
        onChange={onChangeContent}
        onKeyDown={onKeyDown}
        placeholder='새로운 Todo...'/>
        <button onClick={onSubmit}>추가</button>
    </div>
  )
}

export default Editor