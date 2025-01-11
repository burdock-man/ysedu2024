import React, { useState } from 'react'
import TodoItem from './TodoItem'
import './List.css'

function List({todos}) {

  const [search, setSearch] = useState("");
  const onChangeSearch = (e) => {
    setSearch(e.target.value); // 입력한 값을 search에 저장
  }

  const getFilteredData = () => {
    if (search === "") {
      return todos; // 검색창에 아무것도 입력이 안되면 todos 전체를 반환
    }
    return todos.filter((todo) => {
      todo.content.toLowerCase().includes(search.toLowerCase());
    });
  }

  const filteredTodos = getFilteredData();

  return (
    <div className='List'>
        <h4>Todo List</h4>
        <input
        value={search}
        onChange={onChangeSearch}
        placeholder='검색어를 입력하세요.'/>
        <div className='todos_wrapper'>
          {filteredTodos.map((todo) => {
            return <TodoItem key={todo.id} {...todo}/>
          })}
        </div>
    </div>
  )
}

export default List