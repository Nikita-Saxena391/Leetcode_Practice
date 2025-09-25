class Solution {
public:
const int maxn=1e4+1;
vector<int> prime;
set<long long> my_bucket;
Solution(){
    prime.assign(maxn,true);
    sieve();
}
void sieve(){
    prime[0]=false;
    prime[1]=false;
    int lim=(int)sqrt(maxn);
    for(int i=2;i<=lim;i++){
        if(prime[i]==true){
            for(int j=2*i;j<maxn;j+=i){
prime[j]=false;
my_bucket.insert(i*i);
            }
        }
    }
}

    bool isThree(int n) {
        if(n<=1){
            return false;
        }
        if(n==2){
            return false;
        }
        if(my_bucket.find(n)!=my_bucket.end()){
            return true;
        }
        return false;
    }
};