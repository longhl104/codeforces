#include <bits/stdc++.h>

using namespace std;

int n;

int main() {
	cin>>n;
	int a;
	bool res = false;
	for (int i=0;i<n;++i) {
		cin>>a;
		if(a)
			res = true;
	}
	if(res)
		cout<<"HARD";
	else cout<<"EASY";
}