package tests.CardulCuMilioaneDeIdeiTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;


public class CardulCuMilioaneDeideiTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(CardulCuMilioaneDeideiTest.class);

    @Test
    public void clickCardulCuMilioaneDeIdei() {

        String recipientName = "Mihai Popescu";
        String Email = "mihaipopescu@gmail.com";
        String senderName = "Oana Vasiloiu";
        String senderMessage = "La multi ani";


        LOG.info("Click Cardul Cu Milioane de Idei");
        cardulCuMilioaneDeIdeiPage.setClickCardulCuMilioaneDeIdei();

        LOG.info("Click Continua button");
        cardulCuMilioaneDeIdeiPage.setClickContinuaButton();

        LOG.info("Click 50Lei button");
        cardulCuMilioaneDeIdeiPage.setClick50LeiButton();

        LOG.info("Click Continua");
        cardulCuMilioaneDeIdeiPage.setClickContinua();

        LOG.info("Type in RecipientName");
        cardulCuMilioaneDeIdeiPage.typeInRecipientName(recipientName);

        LOG.info("Type in RecipietEmail");
        cardulCuMilioaneDeIdeiPage.typeInRecipientEmail(Email);

        LOG.info("Type in RecipietEmailConfirm");
        cardulCuMilioaneDeIdeiPage.typeInRecipientEmailConfirm(Email);

        LOG.info("Type in SenderName");
        cardulCuMilioaneDeIdeiPage.typeInSenderName(senderName);

        LOG.info("Type in SenderMessage");
        cardulCuMilioaneDeIdeiPage.typeInSenderMessage(senderMessage);



    }

}