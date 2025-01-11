import { useState, useRef } from "react";

function InputSample3() {

    const [inputs, setInputs] = useState ({
        name:'',
        nickName:'',
        email:''
    });

    const nameInput = useRef();

    const {name, nickName, email} = inputs;
    // 비구조화 할당으로 값을 추출

    const onChange = (e) => {
        const {value, name} = e.target; // e.target에서 name과 value를 추출
        setInputs({
            ...inputs, // 기존의 값을 불러와라. // 이거하면 name에서 nickname으로 넘어가도 초기화가 안됨.
            [name]:value //name의 키값을 업데이트
        })
    }

    const onReset = () => {
        setInputs({
            name:"",
            nickName:"",
            email:"",
        });
        nameInput.current.focus(); // input창을 클릭해서 커서를 깜빡여라
    }

    return (
        <div>

            <input name="name" onChange={onChange} value={name} placeholder="이름" ref={nameInput}/>
            <input name="nickName" onChange={onChange} value={nickName} placeholder="닉네임"/>
            <input name="email" onChange={onChange} value={email} placeholder="이메일"/>
            <button onClick={onReset}>초기화</button>
            <div>
                <b>값: </b>
                {name}({nickName}) - {email}
            </div>

        </div>
    );
}

export default InputSample3;