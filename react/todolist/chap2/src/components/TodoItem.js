import React from 'react'
import './TodoItem.css'

function TodoItem(props) {
  // List부터 네가지 값을 props로 전달 받는다. (구조분해할당)
  return (
    <div className='TodoItem'>
        <input type='checkbox' readOnly checked={props.isDone}/>
        <div className='content'>{props.content}</div>
        <div className='date'>{new Date(props.date).toLocaleDateString()}</div>
        <button>삭제</button>
    </div>
  )
}

export default TodoItem