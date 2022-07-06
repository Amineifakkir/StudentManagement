/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import pfe.view.Login;


/**
 *
 * @author Electronic Store
 */
public class Pfe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         new Login().setVisible(true);
    }
    
}
