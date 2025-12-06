import React, { useState } from "react";
import { useNavigate } from "react-router-dom";

export default function LoginDemo() {
    const [uname, setUname] = useState('');
    const [pass, setPass] = useState('');
    const [msg, setMsg] = useState('');
    const navigate = useNavigate();

    function check(e) {
        e.preventDefault();
        if (validate()) {
            setMsg('Valid User');
            navigate('/'); // Redirect to home page
        } else {
            setMsg('Invalid User');
        }
    }

    function validate() {
        return uname === 'a' && pass === 'a';
    }

    return (
        <>
            <div style={{ padding: 150, backgroundColor: 'cyan' }}>
                <form onSubmit={check}>
                    Enter UserName :
                    <input
                        type="text"
                        value={uname}
                        onChange={(e) => setUname(e.target.value)}
                    />
                    <br />
                    Enter Password  :
                    <input
                        type="password"
                        id="pass1"
                        value={pass}
                        onChange={(e) => setPass(e.target.value)}
                    />
                    <br />
                    <input type="submit" value="submit" />
                </form>
                <div style={{ marginTop: 10, color: "red" }}>{msg}</div>
            </div>
        </>
    );
}