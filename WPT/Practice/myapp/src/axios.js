import { useEffect,useState } from "react";
import axios from "axios";

function User(){
    const [data,setData]=useState([])

    useEffect(()=> {
        axios
           .get("https://jsonplaceholder.typicode.com/posts")
           .then((response)=>setData(response.data))
           .catch((error)=>console.error("error"))
    },[]);
    
    return (
        <div>
            <h1>Post</h1>
            <ul>
                {data.map((post)=>(
                    <li key= {post.id}>{post.title}</li>
                ))}
            </ul>
        </div>
    )
}
export default User;