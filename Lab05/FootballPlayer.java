/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab05;

/**
 *
 * @author pc
 */
public class FootballPlayer extends Player {

    private int playerNumber;
    private String position;

    public void setPlayerNumber(int n) {
        playerNumber = n;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPosition(String p) {
        position = p;
    }

    public String getPosition() {
        return position;
    }

    public boolean isSamePosition(FootballPlayer p) {
        return this.getPosition() == p.getPosition()
                && this.getTeam()==p.getTeam();
    }
//    public boolean isSamePosition(FootballPlayer p){
//        if((p.getPosition().equals(this.getPosition()))&
//        (p.getTeam().equals(this.getTeam()))){
//            return true;
//        }else{
//            return false;
//        }
//    public boolean isSamePosition (FootballPlayer p) {
//        if((p.getPosition().equals(this.position))&
//        (p.getTeam().equals(this.team))){
//            return true;
//        }else{
//            return false;
//            }
//        }
}
