/**
 * 
 */
		let ul = document.createElement('ul'); //DOM
		let li = document.createElement('li');
		li.setAttribute('class', 'second');
		let txt = document.createTextNode('Apple');
		li.appendChild(txt);
		ul.appendChild(li);
		
		li = document.createElement('li');
		txt = document.createTextNode('Banana');
		li.appendChild(txt);
		ul.appendChild(li);
		
		document.getElementById('clone').appendChild(ul);
		
		console.log(ul);