import { useState } from "react";
function InputSample1(){
    const [inputs, setINputs] = useState({
        name:'',
        nickname:''
    });
   
    const onChange = (e) =>{ 
        setText(e.target.value);
       
    }
    const onReset =() =>{
        setText('');
       
    }

    return(
        <div>
            <input name="name" placeholder="이름" onChange={onChange} value={name}/>
            <input name="nickname" placeholder="닉네임" onChange={onChange} value={nickname}/>
            <button onClick={onReset}>초기화</button>
            <div>
                <b>값: </b>
                {name}({nickname})
            </div>
        </div>
    );
}
export default InputSample1;