import React from "react";
import "../styles/member.css";


// Header 함수 컴포넌트 정의
const Login = () =>{
    return (
        <main id="content">
            <h2>로그인</h2>
            <form name="loginfrm" id="loginfrm" method="post" noValidate>

                <div className="form-floating my-2">

                    <input type="text" name="userid" id="userid"
                           className="form-control" required placeholder="아이디"/>
                    <label htmlFor="userid" className="form-label">아이디</label>

                </div>

                <div className="form-floating my-2">

                    <input type="password" name="password" id="password"
                           className="form-control" required placeholder="비밀번호"/>
                    <label htmlFor="password" className="form-label">비밀번호</label>
                </div>

                <div className="d-flex justify-content-center py-2 gap-2">
                    <button type="submit" className="btn btn-primary">
                        <i className="fa-solid fa-right-to-bracket"></i> 로그인
                    </button>
                    <button type="button" className="btn btn-danger">
                        <i className="fa-solid fa-key"></i> 비밀번호 찾기
                    </button>
                </div>

            </form>

        </main>
    )
}

export default Login;