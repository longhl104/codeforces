#include <bits/stdc++.h>

using namespace std;

int a,b;
int res;

int main() {
	cin>>a>>b;
	while(a<=b) {
		a*=3;
		b*=2;
		++res;
	}
	cout<<res;
}