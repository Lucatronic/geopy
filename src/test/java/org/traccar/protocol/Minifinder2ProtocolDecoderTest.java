package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class Minifinder2ProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        var decoder = new Minifinder2ProtocolDecoder(null);

        verifyPositions(decoder, binary(
                "ab10350015ae59010110013836333932313033333836353231360924723a12610042535a182ac0f6b4f2923100c900af02215c2b9bfb5461736b4c4d53"));

        verifyNull(decoder, binary(
                "ab10150076f1320003100133353534363530373130323933303602105a"));

        verifyNull(decoder, binary(
                "AB101400594A01000310013836333932323033343437333734350112"));

        verifyPositions(decoder, binary(
                "ab183200c6bd020101100138363838333230343730323133363209247a0b146090087a641528c03a79ba309be5dec3c2024122c21c2407676267"));

        verifyNotNull(decoder, binary(
                "ab18480066b107010110013836383833323034373030373832350924a230e35f8200ea312b22bc7894b4b86956a31cbdb989fdb8b502ad2449ea60ab646eea0d5663c59c3dcf05549eb3b095754322df"));

        verifyPositions(decoder, false, binary(
                "ab180104c8d0400301100138363136323930353030303038393609243d3b3d4b0000065109249a3d3d4b0200e6504022ca603a7cf07c26c9c4f08159bf8cc448a73c3ec499c0ec0c4591e706bf94bf8087b878be943bb04351a3bd603a7cb4cae9b8d8150dfb98edb6943bb04353b0092486473d4b0210064d4722cec4f08159bf8ccc943bb04a2fa5c794bf8087b878c754a7033b6c57c60c8447c13e5dc5603a7cf07c26c248a73c3ec499c130fd652c9fadba04d3b5b7819cba40313cf75bfe0924f1ab3e4b0200064b2b22d5943bb04a2fa5ca94bf8087b878c7943bb04351a3c5d8150dfb98edba0c8447c13e5db9603a7cb4cae90924be95615f0101065116207bae800d0c1cf343000075006000020000000000000924799f615f0101064f162085af800d861bf343000085006a00030000000000000924c5e77e5f010106531620b8af800dd519f34300006c005d000200000000000009248ef77e5f11019e53162011af800da71bf343000056005d00020000000000000924f9017f5f0101b6531620a1b0800d8c1af343000020015700020000000000000924274e895f02104e531622d8862519239337d4286c074c2110b798ded0aa85e809247f50895f12105e631d22d5286c074c2110d2e0606614a079d0862519239337b798ded0aa85e809248d51895f02005e640902001002008d51895f0f22d6286c074c2110b498ded0aa85e809249551895f02105e640f22d6286c074c2110b498ded0aa85e809249f51895f021056640f22d6286c074c2110b498ded0aa85e80924a951895f02005e640f22d6286c074c2110b498ded0aa85e80924b351895f020056640f22d6286c074c2110b498ded0aa85e80924bd51895f020056640f22d6286c074c2110b498ded0aa85e80924c751895f020056640f22d6286c074c2110b498ded0aa85e80924d551895f020056641622d6e0606614a079c9862519239337bb98ded0aa85e80924db51895f020066641622d6e0606614a079c9862519239337bb98ded0aa85e80924e451895f02006e641622d6e0606614a079c9862519239337bb98ded0aa85e80924ee51895f020076641622d6e0606614a079c9862519239337bb98ded0aa85e80924f851895f120046631622d6e0606614a079c9862519239337bb98ded0aa85e809240252895f120046631622d6e0606614a079c9862519239337bb98ded0aa85e809240c52895f120046631622d6e0606614a079c9862519239337bb98ded0aa85e809241952895f120046630f22dc286c074c2110b798ded0aa85e809242352895f1101466316200a35411cb215460b0100f800c9000500000000000009242b52895f11013e631620fa34411cd315460b0000f800d1000400000000000009243552895f110146631620b734411c1017460b0000f800d20004000000000000"));

        verifyPositions(decoder, binary(
                "ab10cf0382171a0c0110013836353036383034303030303132380924d2a85b5f010296411620d8d9cf13283b5fc601000000e4065500ac4001000b0924dca85b5f0102964116205fd4cf13c53d5fc6010099009f074300ac4001000b0924e6a85b5f010296411620dbd0cf13b83b5fc60d00df00d0074300ac4001000b0924f0a85b5f010296411620a0cccf1339195fc61c000a01fd074000ac4001000b0924faa85b5f010296411620efd9cf135f0b5fc61f00a600b0074200124101000b092404a95b5f010296411620c1eecf13de235fc627005400d3074300124101000b09240ea95b5f010296411620b6f0cf139d505fc628005400280846007d4101000b092418a95b5f01029641162041f2cf13d5835fc62b0056006a084600514201000b092422a95b5f0102964116204ee6cf137ea25fc62100a00091084000514201000b09242ca95b5f01029641162042d6cf130a9a5fc62100fd0085074300b74201000b092436a95b5f010296411620a6d4cf132b6a5fc628000a01250841001e4301000b092440a95b5f01029641162039d1cf1336445fc61200100127084000894301000b09244aa95b5f010296411620bad5cf13eb3d5fc601004e001d084c00894301000b092454a95b5f01029641162042d6cf13163e5fc6000004006e084500894301000b09245ea95b5f01029641162008d9cf1322395fc60100000032084000894301000b092468a95b5f010296411620bfd5cf1345395fc60000080069084c00894301000b092472a95b5f01029641162001d7cf13e8375fc6000000003e085200894301000b09247ca95b5f0102964116204fd7cf136c3a5fc60000000055085400894301000b092486a95b5f010296411620d2d7cf1364395fc600000000a8076c00894301000b092490a95b5f010296411620fdd6cf13383a5fc6000000003c084d00894301000b09249aa95b5f01029641162049d7cf13d9395fc600000000be076c00894301000b0924a4a95b5f010296411620e8d5cf133f375fc6000000001a085900894301000b0924aea95b5f01029641162080d9cf13e3395fc60000000080076c00894301000b0924b8a95b5f010296411620a1d9cf13ac395fc6000000006f075b00894301000b0924c2a95b5f010296411620f3d9cf13b53a5fc60000000090074f00894301000b0924cca95b5f010296411620a1d7cf13aa385fc6000000001d084d00894301000b0924d6a95b5f0102964116208fd8cf1393385fc600000000fc074d00894301000b0924e0a95b5f0102964116206dd7cf13ae395fc600000000ef074d00894301000b0924eaa95b5f01029641162044d8cf1388395fc600000000a5075200894301000b"));

        verifyNotNull(decoder, binary(
                "ab10ba034461360201100138363339323130333135313139363009245b364f5f3200ae646a22a76ce873a3ee50b8547595374807b2fad027610438b504d3b5b7819cb2943bb04351a3b094bf8087b878b8502b7306cb11aec85ba0a15044a7dcfe18bdcdf8ac1226a6964e1ab00c8447c13e5dbf480eecf0e436a1c486e987b794a5b8f88340d7b5ad9ca615c91cda092464364f5f3200ae646a22a76ce873a3ee50b8547595374807b2fad027610438b504d3b5b7819cb2943bb04351a3b094bf8087b878b8502b7306cb11aec85ba0a15044a7dcfe18bdcdf8ac1226a6964e1ab00c8447c13e5dbf480eecf0e436a1c486e987b794a5b8f88340d7b5ad9ca615c91cda09246e364f5f3200ae646a22a76ce873a3ee50b8547595374807b2fad027610438b504d3b5b7819cb2943bb04351a3b094bf8087b878b8502b7306cb11aec85ba0a15044a7dcfe18bdcdf8ac1226a6964e1ab00c8447c13e5dbf480eecf0e436a1c486e987b794a5b8f88340d7b5ad9ca615c91cda09246f364f5f3200ae646a22a76ce873a3ee50b8547595374807b2fad027610438b504d3b5b7819cb2943bb04351a3b094bf8087b878b8502b7306cb11aec85ba0a15044a7dcfe18bdcdf8ac1226a6964e1ab00c8447c13e5dbf480eecf0e436a1c486e987b794a5b8f88340d7b5ad9ca615c91cda092478364f5f3200ae646a22a76ce873a3ee50b8547595374807b2fad027610438b504d3b5b7819cb2943bb04351a3b094bf8087b878b8502b7306cb11aec85ba0a15044a7dcfe18bdcdf8ac1226a6964e1ab00c8447c13e5dbf480eecf0e436a1c486e987b794a5b8f88340d7b5ad9ca615c91cda092482364f5f3200ae646a22a76ce873a3ee50b8547595374807b2fad027610438b504d3b5b7819cb2943bb04351a3b094bf8087b878b8502b7306cb11aec85ba0a15044a7dcfe18bdcdf8ac1226a6964e1ab00c8447c13e5dbf480eecf0e436a1c486e987b794a5b8f88340d7b5ad9ca615c91cda09248c364f5f3200ae646a22a76ce873a3ee50b8547595374807b2fad027610438b504d3b5b7819cb2943bb04351a3b094bf8087b878b8502b7306cb11aec85ba0a15044a7dcfe18bdcdf8ac1226a6964e1ab00c8447c13e5dbf480eecf0e436a1c486e987b794a5b8f88340d7b5ad9ca615c91cda092496364f5f3200ae646a22a76ce873a3ee50b8547595374807b2fad027610438b504d3b5b7819cb2943bb04351a3b094bf8087b878b8502b7306cb11aec85ba0a15044a7dcfe18bdcdf8ac1226a6964e1ab00c8447c13e5dbf480eecf0e436a1c486e987b794a5b8f88340d7b5ad9ca615c91cda"));

        verifyNotNull(decoder, binary(
                "ab1024009b3f9742011001383635323039303336333430303235113154cfc95d0a00000080d0c95d0a000000"));

        verifyPositions(decoder, binary(
                "ab103f007e2533000110013335353436353037313032393330360930e09d245d210100000924b49e245d01025b201620e6c03b1ef367420400000000aa026d00c90e0000100110"));

        verifyNotNull(decoder, binary(
                "ab1845005d39370301100133353836383830303030303338303209245b92b55c84004b610502001000002221ca00050b4a005cc30f4a0056c80f4a003ba90e4a0055c8074a005dc3034a0057c8"));

        verifyNotNull(decoder, binary(
                "ab185c001db78b03011001333538363838303030303033383032092448bd8a5c82003b130502010000003922ca923bad10f794bd30b5c2cb0595b2944a0c49a4f9b6a4b1e9991e79ba0026bb78c08fb4581faae7ee3fb0e091f5778e96b074a78ed46528"));

        verifyNotNull(decoder, binary(
                "ab18ba0339dd89030110013335383638383030303030333830320924b9298a5c940083392221ca0005154a005dc3144a003ba90d4a00876c0d4a00406c0c4a00856c0a4a0056c80924a92a8a5c94003b452221ca0005154a005dc3154a003ba9124a0056c80e4a00876c0d4a00856c064a0057c80924d52b8a5c94007b4e2221ca0005124a005dc31a4a003ba90d4a0056c80d4a005cc30c4a00856c0c4a00406c1931a4298a5c8c050000d02a8a5c7e040000fc2b8a5c422200000924012d8a5c94009b592221ca0005134a005dc3174a003ba9164a0056c8114a00856c104a00406c0f4a0057c809242d2e8a5c9400bb5f2221ca00051a4a005dc3164a003ba9124a0056c8104a00406c0d4a00856c0c4a005cc30924592f8a5c9400bb642221ca00051a4a005dc3154a003ba9114a00406c104a0056c80c4a00856c0c4a005cc3092485308a5c9400bb642221ca00051a4a005dc3154a003ba9114a0056c8104a00406c0c4a005cc30b4a0057c80924b1318a5c9400bb642221ca00051a4a005dc3154a003ba9124a0056c80c4a00856c0b4a005cc30a4a0057c80924dd328a5c9400bb642221ca00051a4a005dc3154a003ba9114a0056c8104a00406c0c4a00856c0b4a005cc30931542e8a5c34440000092409348a5c9400bb642221ca00051a4a005dc3134a003ba9124a0056c80c4a005cc30c4a00856c0a4a0057c8092436358a5c9400bb642221ca00051b4a005dc3164a003ba9124a0056c8114a00406c0c4a00856c0c4a005cc3092462368a5c9400bb642221ca00051b4a005dc3154a003ba9134a0056c80f4a00406c0e4a005cc30c4a00856c09248e378a5c9400bb642221ca00051b4a005dc3174a003ba9134a0056c8104a00406c0e4a005cc30c4a00856c0924ba388a5c9400bb642221ca00051b4a005dc3164a003ba9134a0056c8114a00406c0d4a00856c0c4a0057c80924e6398a5c9400bb642221ca00051b4a005dc3134a0056c8104a00406c0e4a00856c0c4a005cc30a4a0057c80924123b8a5c9400b3642221ca0005194a005dc3184a003ba9134a0056c8104a00406c0d4a00856c0d4a005cc309243e3c8a5c9400bb642221ca00051a4a005dc3164a003ba9114a0056c8104a00406c0e4a00856c0c4a005cc309246a3d8a5c940063642221ca00051a4a005dc3174a003ba9114a00406c0f4a0056c80d4a00856c0c4a0057c80924963e8a5c840083642221ca0005144a005dc31d4a0056c81a4a00d73a174a003ba9164a00856c134a005cc30924c43f8a5c840083632221ca0005164a005cc31b4a0056c8174a003ba9164a006903134a005dc3124a006803"));

    }

}
