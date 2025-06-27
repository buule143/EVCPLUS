

//impo;rt

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Fadlan Soo Gali Numberka Dial :");
        String Evc_plus1 = input.nextLine();
//        CHECKING STRING = EVC_Plus1.

        if (Evc_plus1.equals("*770#")) {
            System.out.print("-EVCPLUS-\n Fadlan geli PIN-kaaga (Enter PIN): ");


//         QAYBTA HUBINTA PINKA / SIRTA.
            int Pin = input.nextInt();

            if (Pin == 2025) {
                System.out.println("EVCPlus");
                System.out.println("  1. Itus Haraagaaga ");
                System.out.println("  2. Kaarka Hadalka ");
                System.out.println("  3. Bixi Biil ");
                System.out.println("  4. Uwareeji EVCPlus ");
                System.out.println("  5. Warbixin Kooban ");
                System.out.println("  6. Salaam Bank ");
                System.out.println("  7. Maareynta ");
                System.out.println("  8. Bill Payment ");
                System.out.println("  0. kabax ");


//            HARAAGA IYO KAARKA NUMBERKA.

                int Haraagaaga = 200;
                int Random_Kaarka = 610945561;

                int Evcplus = input.nextInt();


//          1. HORMUUD MESSAGE.

                if (Evcplus == 1) {
                    System.out.println("Haraagaagu Waa $" + Haraagaaga + "@");
                }


//            2. KAARKA HADALKA.

                else if (Evcplus == 2) {
                    System.out.println("Kaarka hadalka");
                    System.out.println("  1. Ku Shubo Airtime");
                    System.out.println("  2. Ugu Shub Airtime");
                    System.out.println("  3. MIFI Packages");
                    System.out.println("  4. Ku Shubo internet");
                    System.out.println("  5. Ugu shub qof kale (MMT)");


                    int Ku_shubo_airtime = input.nextInt();

//                KU SHUBO AIRTIME.

                    if (Ku_shubo_airtime == 1) {

                        System.out.print("Fadlan Geli Lacagta : ");
                        int Hadiga_Kaarka = input.nextInt();
                        System.out.println("Ma hubtaa inaad $" + Hadiga_Kaarka + " ugu shubtid undefined");
                        System.out.println("1. Haa");
                        System.out.println("2. Maya");

                        int Check_Kaarka = input.nextInt();

                        if (Check_Kaarka == 1) {
                            System.out.println("Waxaad ku Guuleysatay inaad ku shubto $" + Hadiga_Kaarka + " Ku Hadal");
                        } else {
                            System.out.println("Mahadsanid!.");
                        }
                    }


//                KU SHUBIDA ANFAC PLUS.

                    else if (Ku_shubo_airtime == 2) {
                        System.out.println("Fadlan Geli Mobilka :");
                        int Number_Ku_shubida = input.nextInt();
                        System.out.print("Fadlan Geli Lacagta : ");
                        int Haddi = input.nextInt();
                        System.out.println("Ma hubtaa inaad $" + Haddi + " u shubtid " + "252-" + Number_Ku_shubida);
                        System.out.println("1. Haa");
                        System.out.println("2. Maya");
                        int Check_Lacagta = input.nextInt();

//                  HUBIN LACAGTA MARKI AAD RABTO INAAD DIRTO.

                        if (Check_Lacagta == 1) {
                            System.out.println("waad ku guuleystay in aad ugu shubto " + Number_Ku_shubida + " ku hadal.");
                        } else {
                            System.out.println("Mahadsanid!.");
                        }

                    }

//                 KU SHUBO MIFIGA.

                    else if (Ku_shubo_airtime == 3) {
                        System.out.println("Evcplus \n 1: Ku Shubo data-da MIFI ");
                        int Mifi = input.nextInt();

//                  STARTING.

                        switch (Mifi) {
                            case 1:
                                System.out.println("-Internet Bundle Recharge -");
                                System.out.println("1.isbuucle(Weakly) \n 2.Malinle(Daily)\n 3.Bille(MIFI)");

                                int date_Limited = input.nextInt();

                                switch (date_Limited) {
                                    // QEYBTA UGU HOREYSA MIFIGA.

                                    case 2:
                                        System.out.println("Fadlan Dooro bunleKa");
                                        System.out.println("1.$5 = 10 GB");
                                        System.out.println("2.$10 = 25 GB");


                                        // QEYBTA  KU SHUBIDA.

                                        int Exchange_date = input.nextInt();

                                        if (Exchange_date == 1) {
                                            System.out.print("Fadlan Geli MIFI user : ");
                                            int MIFI_user = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $5 ugu shubtid " + MIFI_user);
                                            System.out.println("1.HAA\n2.MAYA");

                                            int Xaqiin = input.nextInt();
                                            if (Xaqiin == 1) {
                                                System.out.println("waxa ugu shubtay 10GB " + MIFI_user);

                                            } else {
                                                System.out.println("Macsalaama");
                                            }
                                        } else if (Exchange_date == 2) {
                                            System.out.print("Fadlan Geli MIFI user : ");
                                            int MIFI_user = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $10 ugu shubtid " + MIFI_user);
                                            System.out.println("1.HAA\n2.MAYA");

                                            int Xaqiijin = input.nextInt();
                                            if (Xaqiijin == 1) {
                                                System.out.println("waxa ugu shubtay 25GB " + MIFI_user);

                                            } else {
                                                System.out.println("Macsalaama");
                                            }
                                        }
                                        break;

                                    //  QEYBTA XIGTA EE MIFI.

                                    case 3:
                                        System.out.println("Fadlan Dooro bunle Ka");
                                        System.out.println("1.$1 = 2GB");
                                        System.out.println("2.$2 = 5GB");

                                        int Exchange_date_2 = input.nextInt();
                                        if (Exchange_date_2 == 1) {
                                            System.out.print("Fadlan Geli MIFI user : ");
                                            int MIFI_user = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $1 ugu shubtid " + MIFI_user);
                                            System.out.println("1.HAA\n2.MAYA");

                                            int Xaqijin = input.nextInt();
                                            if (Xaqijin == 1) {
                                                System.out.println("waxa ugu shubtay 2GB " + MIFI_user);

                                            } else {
                                                System.out.println("Macsalaama");
                                            }
                                        } else if (Exchange_date_2 == 2) {
                                            System.out.print("Fadlan Geli MIFI user : ");
                                            int MIFI_user = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $2 ugu shubtid " + MIFI_user);
                                            System.out.println("1.HAA\n2.MAYA");

                                            int Xaqijin = input.nextInt();
                                            if (Xaqijin == 1) {
                                                System.out.println("waxa ugu shubtay 5GB " + MIFI_user);
                                            } else {
                                                System.out.println("Macsalaama");
                                            }
                                        }
                                        break;

//                                QEYBTA XIGTA EE 3AAD EE MIFI.

                                    case 4:
                                        System.out.println("Fadlan Dooro bunle Ka");
                                        System.out.println("1.$20 = 40 GB");
                                        System.out.println("2.$40 = 80 GB");
                                        System.out.println("3.$60 = 150 GB");
                                        System.out.println("4.$30 = Unlimited Month");

                                        int Exchange_date3 = input.nextInt();
                                        if (Exchange_date3 == 1) {
                                            System.out.print("Fadlan Geli MIFI user : ");
                                            int MIFI_user = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $20 ugu shubtid " + MIFI_user);
                                            System.out.println("1.HAA\n2.MAYA");

                                            int Xaqi = input.nextInt();
                                            if (Xaqi == 1) {
                                                System.out.println("waxa ugu shubtay 40GB " + MIFI_user);
                                            } else {
                                                System.out.println("Macsalaama");
                                            }
                                        } else if (Exchange_date3 == 2) {
                                            System.out.print("Fadlan Geli MIFI user : ");
                                            int MIFI_user = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $40 ugu shubtid " + MIFI_user);
                                            System.out.println("1.HAA\n2.MAYA");

                                            int Xaqi = input.nextInt();
                                            if (Xaqi == 1) {
                                                System.out.println("waxa ugu shubtay 80GB " + MIFI_user);
                                            } else {
                                                System.out.println("Macsalaama");
                                            }
                                        } else if (Exchange_date3 == 3) {
                                            System.out.print("Fadlan Geli MIFI user : ");
                                            int MIFI_user = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $60 ugu shubtid " + MIFI_user);
                                            System.out.println("1.HAA\n2.MAYA");

                                            int Xaqi = input.nextInt();
                                            if (Xaqi == 1) {
                                                System.out.println("waxa ugu shubtay 150GB " + MIFI_user);

                                            } else {
                                                System.out.println("Macsalaama");
                                            }
                                        } else if (Exchange_date3 == 4) {
                                            System.out.print("Fadlan Geli MIFI user : ");
                                            int MIFI_user = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $30 ugu shubtid " + MIFI_user);
                                            System.out.println("1.HAA\n2.MAYA");

                                            int Xaqi = input.nextInt();
                                            if (Xaqi == 1) {
                                                System.out.println("waxa ugu shubtay Unlimited Month " + MIFI_user);
                                            } else {
                                                System.out.println("Macsalaama");
                                            }
                                        }
                                        break;

                                }

                        }

                    } else if (Ku_shubo_airtime == 4) {
                        System.out.println("-- Fadlan Dooro numberka- aad ku shubeyso -- ");
                        System.out.println("1. isbuucle (Weekly)");
                        System.out.println("2. Time Based Packages");
                        System.out.println("3. Data");
                        System.out.println("4. Maalinle(Daily)");
                        System.out.println("5 .Bille (MIFI)");

                        int ku_shubasho = input.nextInt();
                        switch (ku_shubasho) {
                            case 1:
                                System.out.print("Fadlan Geli Lacagta : ");
                                int Lacag_ku_shubid = input.nextInt();
                                System.out.println("Ma hubtaa in aad $" + Lacag_ku_shubid);
                                System.out.println("1. Haa \n 2.Maya");

                                int Hubinta_ku_shubida = input.nextInt();
                                if (Hubinta_ku_shubida == 1 && Lacag_ku_shubid >= Haraagaaga) {
                                    System.out.println("Haraagaaga kuguma Filna No-Mobilka +252" + Random_Kaarka);

                                } else if (Hubinta_ku_shubida == 2) {
                                    System.out.println("Macsalaama");
                                } else {
                                    System.out.println("Waxa ku shubatay $" + Lacag_ku_shubid);
                                }

                                break;
                            //                         QEYPTA TIME BASED
                            case 2:
                                System.out.println("Fadlan Geli LacagTa : ");
                                int Lacagta_ugu_shubida = input.nextInt();
                                System.out.println("Ma Hubtaa inaad $" + Lacagta_ugu_shubida);
                                System.out.println("1.Haa \n2.Maya");

//                          CHECKING....

                                int Hubinta_ugu_shubida = input.nextInt();
                                if (Hubinta_ugu_shubida == 1 && Lacagta_ugu_shubida >= Haraagaaga) {
                                    System.out.println("Haraagaagu xisaabtada kuma Filno No-Mobilka +252 " + Random_Kaarka);

                                } else if (Hubinta_ugu_shubida == 2) {
                                    System.out.println("Macsalaama");
                                } else {
                                    System.out.println("Waxa Ugu shubatay $" + Lacagta_ugu_shubida);
                                }
                                break;
                        }
                    }
                }


//        BIXI BILL.

                else if (Evcplus == 3) {
                    System.out.println("Bixi BiLll");
                    System.out.println("1. Post Paid");
                    System.out.println("2. Ku iibso");

                    int Bixi_Biilka = input.nextInt();
                    if (Bixi_Biilka == 1) {
                        System.out.println("Post Paid");
                        System.out.println(" 1.Ogow Biilka.");
                        System.out.println(" 2.Bixi Biil.");
                        System.out.println(" 3.ka Bixi Bill.");

                        int Post_Paid = input.nextInt();

                        if (Post_Paid == 1) {
                            System.out.println("error ocurred, please try again later");
                        } else if (Post_Paid == 2) {
                            System.out.print("Fadlin Geli Lacagta : ");
                            int Hadiga_Biilka = input.nextInt();

                            System.out.println("Ma Hubtaa inaad Bixinayso Biilka lacagta $" + Hadiga_Biilka + " :");
                            System.out.println(" 1.Haa");
                            System.out.println(" 2.Maya");

                            int Check_Hadi = input.nextInt();
                            if (Check_Hadi == 1) {
                                System.out.println("Waxaad Bixisay Biilka Lacagta $" + Hadiga_Biilka + ".");
                            } else {
                                System.out.println("Mahadsanid!.");
                            }
                        } else if (Post_Paid == 3) {
                            System.out.print("Fadlan Geli Mobilka :");
                            int Number_Ku_shubid = input.nextInt();
                            System.out.print("Fadlan Geli Lacagta : ");
                            int Hadi = input.nextInt();
                            System.out.println("Ma hubtaa inaad bixisid bill lacagtiisu tahay : $" + Hadi + " oo laga rabo " +
                                    "tel No " + Number_Ku_shubid);
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            int Check_Lacagta = input.nextInt();

//                       HUBINTA LACAGTA

                            if (Check_Lacagta == 1) {
                                if (Haraagaaga <= Hadi) {
                                    System.out.println("Haraaga Xisaabtaadu kuguma filna, mobile No: +252 " + Random_Kaarka);
                                } else {
                                    double Result_Lacagaha = Haraagaaga - Hadi;
                                    System.out.println("Waxad bixisay biilka $" + Hadi + " Mobilka No: +252" + Number_Ku_shubid);
                                    System.out.println("Haraaga xisaabtaadu waa $" + Result_Lacagaha);
                                }

                            } else {
                                System.out.println("Mahadsanid!.");
                            }
                        }
                    } else if (Bixi_Biilka == 2) {
                        System.out.print("Fadlan Geli aqoonsiga ganacsiga");
                    }
                }

//            U WAREEJI EVCPlus.

                else if (Evcplus == 4) {
                    System.out.print("Fadlan Geli Mobile-ka :");
                    int Number = input.nextInt();
                    System.out.print("Fadlan Geli Lacagta : ");
                    int Hadi = input.nextInt();
                    System.out.println("Ma hubtaa inaad $" + Hadi + " u wareejisid " + " +252 " + Number);
                    System.out.println("1. Haa");
                    System.out.println("2. Maya");
                    int Check_Lacagta = input.nextInt();

//            HUBINTA LACAGTA MARKAD RABTO INAAD DIRTO

                    if (Check_Lacagta == 1) {
                        if (Haraagaaga <= Hadi) {
                            System.out.println("Haraaga Xisaabtaadu kuguma filna, mobile No: +252 " + Random_Kaarka);
                        } else {
                            double Result_Lacagaha = Haraagaaga - Hadi;
                            System.out.println("Haraagaagu waa " + Result_Lacagaha);
                        }

                    } else {
                        System.out.println("Mahadsanid!.");
                    }
                }

//           WARBIXIN KOOBAN.

                else if (Evcplus == 5) {
                    System.out.print("Warbixin Kooban");
                    System.out.println("    1. Last Action");
                    System.out.println("    2. Wareejintii ugu dambsay");
                    System.out.println("    3. iibsashadii ugu dambeysay");
                    System.out.println("    4. Last 3 Actions");
                    System.out.println("    5. Email Me My Activity");

                    int WarbixinTa = input.nextInt();

//            3 LAST ACTIONS.
                    String Last_1 = "[-Evcplus-] \nwaxaad $5 ka heshay 0610945561, Tar: 11/03/23 03:20:11 \n Haraagaagu waa $5.";
                    String Last_2 = "[-Evcplus-] \nwaxaad $10 ka heshay 0683134257, Tar: 11/03/23 03:20:11 \n Haraagaagu waa $15.";
                    String Last_3 = "[-Evcplus-] \nwaxaad $14 aad u wareejisay 0615221122, Tar: 11/03/23 03:20:11 \n Haraagaagu waa $1.";
                    String ugu_danbeysay = "[-Evcplus-] \n Waxaad $1 aad u wareejisay 0612888898, Tar: 11/04/23 02:20:10 \n Haraagaagu waa $0.";

                    if (WarbixinTa == 1) {
                        System.out.println(Last_1);
                    } else if (WarbixinTa == 2) {
                        System.out.println(Last_2);
                    } else if (WarbixinTa == 3) {
                        System.out.println(ugu_danbeysay);
                    } else if (WarbixinTa == 4) {
                        System.out.println(Last_1 + "\n" + Last_2 + "\n" + Last_3);
                    }
//           BANK SALAAM.

                } else if (Evcplus == 6) {
                    System.out.println("Salaam Bank");
                    System.out.println("1: Ka wareeji EVCPlus");


                    int Wareejin_Evc = input.nextInt();
                    if (Wareejin_Evc == 1) {
                        System.out.println("Fadlan Dooro xisaabta Bangiga");
                        System.out.println("1: Salaam soomaali Bank");
                        System.out.println("2: Daarusalaam Bank");
                        System.out.println("3: Bank Beeraha");
                        System.out.println("4: Salaam Schl");


                        int Bank_Money = 1000;
                        int Salaam_Bank = input.nextInt();

                        if (Salaam_Bank == 1) {
                            System.out.print("Fadlan soo Geli Account-ka : ");
                            int Account_user = input.nextInt();
                            System.out.print("Fadlan Geli Macluumaadka : ");
                            String Macluumaadka = input.next();
                            System.out.print("Fadlan Geli Lacagta :");
                            int Hadi_salam = input.nextInt();
                            System.out.println("Ma hubtaa inaad udirayso Account-ka " + Account_user + " $ " + Hadi_salam);
                            System.out.println("1: Haa");
                            System.out.println("2: Maya");

                            int Check = input.nextInt();
                            if (Check == 1) {
                                if (Bank_Money <= Hadi_salam) {
                                    System.out.println("Haraaga Xisaabtada Kuguma Filno +252 : " + Account_user);
                                } else {
                                    double Result_salaam = Bank_Money - Hadi_salam;
                                    System.out.println("waxa u wareejisay Accoun-ta $ " + Hadi_salam);
                                    System.out.println("Haraaga Xisaabtada waa " + Result_salaam);
                                }
                            } else if (Check == 2) {
                                System.out.println("Mahadsanid !");
                            }
                        }


//                    BANK BEERAHA

                        else if (Salaam_Bank == 2) {
                            System.out.print("Fadlan soo Geli Account-ka : ");
                            int Account_user = input.nextInt();
                            System.out.print("Fadlan Geli Macluumaadka : ");
                            String Macluumaadka = input.next();
                            System.out.print("Fadlan Geli Lacagta :");
                            int Hadi_salam = input.nextInt();
                            System.out.println("Ma hubtaa in aad udirayso Account-ka " + Account_user + " $ " + Hadi_salam);
                            System.out.println("1: Haa");
                            System.out.println("2: MaYa");

                            int Check = input.nextInt();
                            if (Check == 1) {
                                if (Bank_Money <= Hadi_salam) {
                                    System.out.println("Haraaga Xisaabtada Kuguma Filno +252 : " + Account_user);
                                } else {
                                    double Result_salaam = Bank_Money - Hadi_salam;
                                    System.out.println("waxa u wareejisay Accoun-ta $ " + Hadi_salam);
                                    System.out.println("Haraaga Xisaabtada waa " + Result_salaam);
                                }
                            } else if (Check == 2) {
                                System.out.println("Mahadsanid !");
                            }
                        }

//                    SALAAAM BANK.

                        else if (Salaam_Bank == 3) {
                            System.out.print("Fadlan soo Geli Account-ka : ");
                            int Account_user = input.nextInt();
                            System.out.print("Fadlan Geli Macluumaadka : ");
                            String Macluumaadka = input.next();
                            System.out.print("Fadlan Geli Lacagta :");
                            int Hadi_salam = input.nextInt();
                            System.out.println("Ma hubtaa inaad udirayso Account-ka " + Account_user + " $ " + Hadi_salam);
                            System.out.println("1: Haa");
                            System.out.println("2: Maya");

                            int Check = input.nextInt();
                            if (Check == 1) {
                                if (Bank_Money <= Hadi_salam) {
                                    System.out.println("Haraaga Xisaabtada Kuguma Filno +252 : " + Account_user);
                                } else {
                                    double Result_salaam = Bank_Money - Hadi_salam;
                                    System.out.println("waxa u wareejisay Accoun-ta $ " + Hadi_salam);
                                    System.out.println("Haraaga Xisaabtada waa " + Result_salaam);
                                }
                            } else if (Check == 2) {
                                System.out.println("Mahadsanid!");
                            }
                        } else if (Salaam_Bank == 4) {
                            System.out.print("Fadlan soo Geli Account-ka : ");
                            int Account_user = input.nextInt();
                            System.out.print("Fadlan Geli Macluumaadka : ");
                            String Macluumaadka = input.next();
                            System.out.print("Fadlan Geli Lacagta :");
                            int Hadi_salam = input.nextInt();
                            System.out.println("Ma hubtaa in aad udirayso Account-ka " + Account_user + " $ " + Hadi_salam);
                            System.out.println("1: Haa");
                            System.out.println("2: Maya");

                            int Check = input.nextInt();
                            if (Check == 1) {
                                if (Bank_Money <= Hadi_salam) {
                                    System.out.println("Haraaga Xisaabtada Kuguma Filno +252 : " + Account_user);
                                } else {
                                    double Result_salaam = Bank_Money - Hadi_salam;
                                    System.out.println("waxa u wareejisay Accoun-ta $ " + Hadi_salam);
                                    System.out.println("Haraaga Xisaabtada waa " + Result_salaam);
                                }
                            } else if (Check == 2) {
                                System.out.println("Mahadsanid !");
                            }
                        }
                    }
                }

//           MAAREYTA...

                else if (Evcplus == 7) {
                    System.out.println("Maareynta");
                    System.out.println("1. Bedel lambarka sirta ah");
                    System.out.println("2. Bedel luqadda");
                    System.out.println("3. Wargelin Mobilka Lumay");
                    System.out.println("4. Lacag Xirasho");
                    System.out.println("5. U celi Lacag qaldantay");
                    System.out.println("6. Enable Mobile Banking");
                }

                //         BIXI BILL

                else if (Evcplus == 8) {
                    int biilka = 10000;
                    System.out.println("EVCPlus");
                    System.out.println("1. itus Haraaga Bill ka");
                    System.out.println("2. Wada Bixi Bill-ka");
                    System.out.println("3. Qeyb Ka bixi bill-ka");


                } else {
                    System.out.println("Macsalaama !");
                }
            }

//     HUBIN PINKA INUU QALDAN YAHAY IYO INKLAE...

            else {
                System.out.println("Pin-kaaga Qalad Fadlan iska Hubi :");
            }

        } else {
            System.out.println("Sorry!, Operation failed due to the invalid message format.");
        }


    }

}