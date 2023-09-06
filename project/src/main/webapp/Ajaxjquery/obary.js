/**
 * objAry.js
 */

const mem1 = {
	name: "홍길동",
	age: 20,
	phone: '010-1111'
}

const mem2 = {
	name: "김길동",
	age: 23,
	phone: '010-2222'
}

const mem3 = {
	name: "박길동",
	age: 26,
	phone: '010-3333'
}

const members = [mem1, mem2, mem3];

let target = document.querySelector('#memberList>tbody');
target.innerHTML = '';
members.forEach(addMember);


function addMember (member = {}) {
	let tr = document.createElement('tr');
	for (let prop in member) {
		let td = document.createElement('td');
		td.innerText = member[prop];
		tr.appendChild(td);
	}
	// 삭제button 생성.
	let td = document.createElement('td');
	let btn = document.createElement('button');
	btn.addEventListener('click', function(e) {
		console.log(e);
		this.parentElement.parentElement.remove();
	});
	btn.innerText = '삭제';
	td.appendChild(btn);

	tr.appendChild(td);
	target.appendChild(tr);
}


let sel = document.querySelector('#list > tbody > tr:nth-child(4) > td > button.add');
sel.addEventListener('click', function(e){
	let name = document.querySelector('input[name="name"]').value;
	let age = document.querySelector('input[name="age"]').value;
	let phone = document.querySelector('input[name="phone"]').value;
	
	const member = {
		name,
		age,
		phone
	}
	addMember(member);
})





document.querySelector('#memberList>tbody button').onclick = function(e) {
	e.target.parentElement.parentElement.remove();
}

document.querySelector('#memberList>tbody button').setAttribute('style', 'color:red')

document.querySelectorAll('#memberList>tbody>tr').forEach(function(tr){
	tr.addEventListener('mouseover',function(){
		tr.setAttribute('style', 'background: yellow');
	})
	tr.addEventListener('mouseout',function(){
		tr.setAttribute('style', 'background: null');
	})
})


