import React, { useState } from 'react'

function TwoApp() {

    const [photo, setPhoto] = useState("../image2/dish2.jpg")
    const changePhoto = (e) => {
        setPhoto(e.target.value);
    }

  return (
    <div>
      <h3 className='alert alert-success'>TwoApp입니다. 라디오버튼.</h3>
      <div>
        <b>이미지 선택 : </b>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <label>
            <input type='radio' name='photo' value={"../image2/dish1.jpg"} onClick={changePhoto}/> 이미지1
        </label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <label>
            <input type='radio' name='photo' value={"../image2/dish2.jpg"} onClick={changePhoto}/> 이미지2
        </label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <label>
            <input type='radio' name='photo' value={"../image2/dish3.jpg"} onClick={changePhoto}/> 이미지3
        </label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <label>
            <input type='radio' name='photo' value={"../image2/dish4.jpg"} onClick={changePhoto}/> 이미지4
        </label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <label>
            <input type='radio' name='photo' value={"../image2/dish5.jpg"} onClick={changePhoto}/> 이미지5
        </label>
      </div>
      <img src={photo}/>
    </div>
  )
}

export default TwoApp
