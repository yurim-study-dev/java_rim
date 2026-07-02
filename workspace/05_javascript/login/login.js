const loginForm = document.querySelector('.login-form');

loginForm.addEventListener('submit',function(event){
  console.log('로그인 요청');
  event.preventDefault();  //브라우저의 기본 동작 취소 (submit 취소)

  if(!loginForm.checkVisibility()){
    return;
  }
});