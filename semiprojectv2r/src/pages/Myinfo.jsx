import React from "react";
import "../styles/member.css";

// Header 함수 컴포넌트 정의
const Myinfo = () =>{
    return (
        <main id="content">
            <h2>회원정보</h2>

            <div id="myinfo">
                <table className="table table-bordered mb-0">

                    <colgroup>
                        <col style="width:30%"/>
                        <col/>
                    </colgroup>
                    <tbody>
                    <tr>
                        <td>아이디</td>

                    </tr>

                    <tr>
                        <td>이름</td>

                    </tr>

                    <tr>
                        <td>이메일</td>

                    </tr>

                    <tr>
                        <td>가입일</td>

                    </tr>
                    </tbody>


                </table>
            </div>
        </main>
    )
}

export default Myinfo;