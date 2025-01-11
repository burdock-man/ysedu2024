import "./App.css";

function Title ({title, text}) {
    return (
        <div>
            <h2 className="title">{text}</h2>
            <p>{title}</p>
        </div>
    );
}
export default Title;



// 상속을 받을 때 위에처럼 상속받는놈을 {중괄호}로 감싸서 줘도 되고,
// 아래처럼 props를 쓰면 되는데, 음.... 어떤게 더 낫나?

// import "./App.css";

// function Title (props) {
//     return (
//         <div>
//             <h2 className="title">{props.text}</h2>
//             <p>{props.title}</p>
//         </div>
//     );
// }
// export default Title;