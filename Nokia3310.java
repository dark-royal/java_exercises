import java.util.Scanner;

public class Nokia3310{
private static Scanner input = new Scanner(System.in);

public static void main(String[] args){
mainMenu();
System.out.println("Enter number: ");
int number = input.nextInt();
switch(number){
	case 1->phoneBook();
	case 2->messages();
	case 3->chat();
	case 4->callRegister();
	case 5->tones();
	case 6->settings();
	case 7->callDivert();
	case 8->games();
	case 9->calculator();
	case 10->reminders();
	case 11->clock();
	case 12->profile();
	case 13->simServices();
}
}






public static void mainMenu() {
System.out.println("""
	1.Phone book
	2.Messages
	3.Chat
	4.Call Register
	5.Tones
	6.Settings
	7.Call Divert
	8.Games
	9.Calculator
	10.Reminders
	11.Clock
	12.Profile
	13.SIM services""");
}



public static void phoneBook() {
System.out.println("""
	1.Search
	2.Service
	3.Add Name
	4.Erase
	5.Edit
	6.Assign tone
	7.Send B' Card
	8.Options
	9.Speed Dials
	10.Voice Tags""");

System.out.println("Enter number: ");
int number2 = input.nextInt();
switch(number2){
	case 1->search();
	case 2->service();
	case 3->addName();
	case 4->erase();
	case 5->edit();
	case 6->assignTone();
	case 7->sendBCard();
	case 8->options();
	case 9->speedDials();
	case 10->voiceTags();
}


System.out.println("Enter number: ");
int number3 = input.nextInt();
switch(number3){
	case 1->options();

System.out.println("Enter number: ");
int number4 = input.nextInt();
switch(number4){
	case 1->typeOfView();
	case 2->memoryStatus();
	

public static void search() {
System.out.println("0.Exit");
System.out.println("Enter a number: ");
int number2 = input.nextInt();

if(number2 == 0){
	phoneBook();
}
}

public static void service() {
System.out.println("0.Exit");
System.out.println("Enter a number: ");
int number2 = input.nextInt();

if(number2 == 0){
	phoneBook();
}																																																																																																																																										
}

public static void addName() {
System.out.println("0.Exit");
System.out.println("Enter number: ");
int number2 = input.nextInt();

if(number2 == 0){
	phoneBook();
}
}

public static void erase() {
System.out.println("0.Exit");
System.out.println("Enter number: ");
int number2 = input.nextInt();

if(number2 == 0){
	phoneBook();

}
}

public static void edit() {
System.out.println("0.Exit");
System.out.println("Enter number: ");
int number2 = input.nextInt();

if(number2 == 0){
	phoneBook();

}
}

public static void assignTone() {
System.out.println("0.Exit");
System.out.println("Enter number: ");
int number2 = input.nextInt();

if(number2 == 0){
	phoneBook();
}


}

public static void sendBCard() {
System.out.println("0.Exit");
System.out.println("Enter number: ");
int number2 = input.nextInt();

if(number2 == 0){
	phoneBook();
}
}


public static void options() {
System.out.println("""
	1.Type of view
	2.Memory Status""");
}
if(number2 == 0){
	phoneBook();
}

public static void typeOfView() {
System.out.println("0.Exit");
System.out.println("Enter number: ");
int number2 = input.nextInt();

if(number2 == 0){
	phoneBook();
}
}



public static void memoryStatus() {
System.out.println("0.Exit");
System.out.println("Enter number: ");
int number2 = input.nextInt();

if(number2 == 0){
	phoneBook();
}
}


public static void speedDials() {
System.out.println("0.Exit");
System.out.println("Enter number: ");
int number2 = input.nextInt();

if(number2 == 0){
	phoneBook();
}


}

public static void voiceTags() {
System.out.println("0.Exit");
System.out.println("Enter number: ");
int number2 = input.nextInt();

if(number2 == 0){
	phoneBook();
}
}
}






public static void messages() {
System.out.println("""
	1.Write messages
	2.Inbox
	3.Outbox
	4.Picture messages
	5.Templates
	6.Smileys
	7.Messages Setting
	8.Info service
	9.Voice mailbox number
	10.Service command editor""");

System.out.println("Enter number: ");
int number4 = input.nextInt();
switch(number4){
	case 1->writeMessages();
	case 2->inbox();
	case 3->outbox();
	case 4->pictureMessages();
	case 5->templates();
	case 6->smileys();
	case 7->messagesSetting();
	case 8->infoService();
	case 9->voiceMailboxNumber();
	case 10->serviceCommandEditor();

public static void messagesSetting(){
System.out.println("Enter number: ");
int number5 = input.nextInt();
switch(number5){
	case 1->messagesSetting();
}
}
public static void set1() {
System.out.println("Enter number: ");
int number6 = input.nextInt();
switch(number6){
	case 1->set1();
	case 2->common();
}
}	


public static void writeMessages() {
System.out.println("0.Exit");
System.out.println("Enter number: ");
int number6 = input.nextInt();

if(number6==0){
	message();
}
}

public static void inbox() {
System.out.println("0.Exit");
}

public static void outbox() {
System.out.println("0.Exit");
}

public static void pictureMessages() {
System.out.println("0.Exit");
}

public static void templates() {
System.out.println("0.Exit");
}

public static void smileys() {
System.out.println("0.Exit");
}

public static void messagesSetting() {
System.out.println("""
	1.Set 1
	2.Common""");
}

public static void set1() {
System.out.println("""
	1.Message centre number
	2.Messages sent as
	3.Message validity""");
}

public static void messageCentrenumber() {
System.out.println("0.Exit");
}

public static void messageSentAs() {
System.out.println("0.Exit");
}

public static void messageValidity() {
System.out.println("0.Exit");
}



public static void common() {
System.out.println("""
	1.Delivery reports
	2.Reply via same centre
	3.Character support""");
}

public static void deliveryReports() {
System.out.println("0.Exit");
}

public static void replyViaSameCentre() {
System.out.println("0.Exit");
}

public static void characterSupport() {
System.out.println("0.Exit");
}


public static void infoService() {
System.out.println("0.Exit");
}

public static void voiceMailboxNumber() {
System.out.println("0.Exit");
}

public static void serviceCommandEditor() {
System.out.println("0.Exit");
}



public static void chat(){
System.out.println("0.Exit");
}

public static void callRegister() {
System.out.println("""
	1.Missed calls
	2.Received calls
	3.Dialed numbers
	4.Erase recent call lists
	5.Show call duration
	6.Show call costs
	7.call cost settings
	8.Prepaid credit""");
}

public static void callRegister(){
System.out.println("Enter number: ");
int number7 = input.nextInt();
switch(number7){
	case 1->showCallCosts();
	case 2->callCostSettings();
	case 3->showCallDuration();
}
}


public static void missedCalls() {
System.out.println("0.Exit");
}

public static void receivedCalls() {
System.out.println("0.Exit");
}

public static void dailedNumbers() {
System.out.println("0.Exit");
}

public static void eraseRecentCallLists() {
System.out.println("0.Exit");
}


public static void showCallDuration() {
System.out.println("""
	1.Last call duration
	2.All call's duration
	3.Received calls' duration
	4.Dialed calls' duration
	5.Clear timers""");
}

public static void lastCallDuration(){
System.out.println("0.Exit");
}

public static void allCallsDuration() {
System.out.println("0.Exit");
}

public static void receivedCallsDuration(){
System.out.println("0.Exit");
}

public static void dailedCallsDuration() {
System.out.println("0.Exit");
}

public static void clearTimer() {
System.out.println("0.Exit");
}



public static void showCallCosts() {
System.out.println("""
	1.Last call cost
	2.All calls cost
	3.Clear counters""");
}

public static void lastCallCost() {
System.out.println("0.Exit");
}

public static void allCallsCost() {
System.out.println("0.Exit");
}

public static void clearCounters() {
System.out.println("0.Exit");
}


public static void callCostSettings() {
System.out.println("""
	1.Call cost limit
	2.Show costs in""");
}

public static void callCostLimit(){
System.out.println("0.Exit");
}

public static void showCostIn(){
System.out.println("0.Exit");
}

public static void prepaidCredit() {
System.out.println("0.Exit");
}


public static void tones() {
System.out.println("""
	1.Ringing tone
	2.Ringing volume
	3.Incoming call alert
	4.Composer
	5.Message alert tone
	6.Keypad tones
	7.Warning and game tones
	8.Vibration alert
	9.Screen saver""");
}

public static void ringingTone() {
System.out.println("0.Exit");
}

public static void ringingVolume() {
System.out.println("0.Exit");
}

public static void incomingCallAlert() {
System.out.println("0.Exit");
}

public static void composer() {
System.out.println("0.Exit");
}

public static void messagesAlertTone() {
System.out.println("0.Exit");
}

public static void keypadTones() {
System.out.println("0.Exit");
}

public static void warningAndGameTones() {
System.out.println("0.Exit");
}

public static void vibratingAlert() {
System.out.println("0.Exit");
}

public static void screenSaver() {
System.out.println("0.Exit");
}


public static void settings() {
System.out.println("""
	1.Call settings
	2.Phone settings
	3.Security settings
	4.Restore factory settings""");
}


public static void callSettings() {
System.out.println("""
	1.Automatic redial
	2.Speed dialing
	3.Call waiting options
	4.Own number sending
	5.Phone line in use
	6.Automatic answer""");
}

public static void automaticRedial() {
System.out.println("0.Exit");
}

public static void speedDialing() {
System.out.println("0.Exit");
}

public static void callWaitingOptions() {
System.out.println("0.Exit");
}

public static void ownNumberSending() {
System.out.println("0.Exit");
}

public static void phoneLineInUse() {
System.out.println("0.Exit");
}

public static void automaticAnswer() {
System.out.println("0.Exit");
}



public static void phoneSettings() {
System.out.println("""
	1.Language
	2.Cell info display
	3.Welcome Notes
	4.Network selection
	5.Lights
	6.Confirm SIM service actions""");
}

public static void language() {
System.out.println("0.Exit");
}

public static void cellInfoDisplay() {
System.out.println("0.Exit");
}

public static void welcomeNote(){
System.out.println("0.Exit");
}

public static void networkSelection() {
System.out.println("0.Exit");
}

public static void lights() {
System.out.println("0.Exit");
}

public static void confirmSimServiceActions() {
System.out.println("0.Exit");
}



public static void securitySetting() {
System.out.println("""
	1.Pin code request
	2.Call barring service
	3.Fixed dialing
	4.Closed user group
	5.Phone security
	6.Change access codes""");
}

public static void pinCodeRequest() {
System.out.println("0.Exit");
}

public static void callBarringService() {
System.out.println("0.Exit");
}

public static void fixedDialing() {
System.out.println("0.Exit");
}

public static void closedUserGroup() {
System.out.println("0.Exit");
}

public static void phoneSecurity() {
System.out.println("0.Exit");
}

public static void changeAccessCodes() {
System.out.println("0.Exit");
}


public static void restoreFactorySettings() {
System.out.println("0.Exit");
}



public static void callDivert() {
System.out.println("0.Exit");
}

public static void games() {
System.out.println("0.Exit");
}

public static void calculator() {
System.out.println("0.Exit");
}

public static void reminders() {
System.out.println("0.Exit");
}

public static void clock() {
System.out.println("""
	1.Alarm clock
	2.Clock settings
	3.Date settings
	4.StopWatch
	5.Countdown timer
	6.Auto update of date and time""");
}

public static void alarmClock() {
System.out.println("0.Exit");
}

public static void clockSettings() {
System.out.println("0.Exit");
}

public static void dateSettings() {
System.out.println("0.Exit");
}

public static void stopWatch() {
System.out.println("0.Exit");
}

public static void countdownTimer() {
System.out.println("0.Exit");
}

public static void autoUpdateOfDateAndTime() {
System.out.println("0.Exit");
}


public static void profile() {
System.out.println("0. Exit");
}

public static void simServices() {
System.out.println("0.Exit");
}
}