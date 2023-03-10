package server;

public class DBAuthService implements AuthService{
    @Override
    public String getNicknameByLoginAndPassword(String login, String password) {
        return SQLHandler.getNickNameByLoginAndPassword(login, password);
    }

    @Override
    public boolean registration(String login, String password, String nickname) {
        return SQLHandler.registration(login, password, nickname);
    }

    @Override
    public boolean changeNick(String oldNickName, String newNickname) {
        return SQLHandler.changeNick(oldNickName, newNickname);
    }

}
