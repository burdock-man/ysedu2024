import { useRef } from "react";

function User ({user}) {
    return (
        <div>
            <b>{user.username}<span>({user.email})</span></b>
        </div>
    );
}

function UserList1({ users }) {

    return (
        // <div>
        //     <div>
        //         <b>{users[0].username}<span>({users[0].email})</span></b>
        //     </div>
        //     <div>
        //         <b>{users[1].username}<span>({users[1].email})</span></b>
        //     </div>
        //     <div>
        //         <b>{users[2].username}<span>({users[2].email})</span></b>
        //     </div>
        // </div>
        // <div>
        //     <User user={users[0]} />
        //     <User user={users[1]} />
        //     <User user={users[2]} />
        // </div>
        <div>
            {users.map(user => (
                <User user={user} key={user.id} />
            ))}
        </div>
    );
}



export default UserList1;