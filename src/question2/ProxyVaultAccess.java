package question2;

public class ProxyVaultAccess extends AbstractVaultAccess  {

    @Override
    public String accessVault(String key, boolean fingerprint, String password, boolean eyeScanner) {
        if(key == "vault_key" && password == "vault_password"){
            return "access_granted";
        }else{
            return "access_denied";
        }
    }
}
