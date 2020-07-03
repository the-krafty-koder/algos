/**
 * Used in solvig the dynamic connectivity problem
 * Slow, running time is quadratic,
 * for N operations on an array of N elements
 *  t = N^2
**/
class QuickFind{

	constructor(n){
		this.id = [];

		for(let i=0;i<n;i++){          // set id of each element to self
			this.id[i] = i;
		}
	}

	connected(p,q){                    // check if both elements have same id
		return this.id[p]==this.id[q] ? true:false
	}

	union(p,q){                        // change all elements of id p to q
		let pid = this.id[p];
		let qid = this.id[q];

		for(let i =0;i<(this.id.length);i++){
			if(this.id[i]==pid)this.id[i] = qid;
		}
	}
}

//test
let test = new QuickFind(10);
test.union(3,5)
test.connected(3,5)===true ? console.log("Passed"): false;

test.union(5,8)
test.connected(5,8)===true ? console.log("Passed"): false;
test.connected(3,8)===true ? console.log("Passed"): false;
