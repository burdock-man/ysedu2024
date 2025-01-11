import UserCard1 from "./UserCard1";

function UserList() {

    const users = [
        {name: "곽복근", age: "98", job: "중고차딜러", isActive: true},
        {name: "장춘옥", age: "86", job: "포켓몬마스터", isActive: false},
        {name: "박금례", age: "85", job: "배구선수", isActive: true},
        {name: "김상덕", age: "78", job: "마법소녀", isActive: true}
    ]

    return (
        <div>
            <h1>사용자목록</h1>
            {users.map((user, index)=>(
                <UserCard1 key={index} name={user.name} age={user.age} job={user.job} isActive={user.isActive} />
            ))};
        </div>
    );
}

export default UserList;