package kr.dogfoot.hwp2hwpx.error;

import kr.dogfoot.hwp2hwpx.Hwp2Hwpx;
import kr.dogfoot.hwplib.object.HWPFile;
import kr.dogfoot.hwplib.reader.HWPReader;
import kr.dogfoot.hwpxlib.object.HWPXFile;
import kr.dogfoot.hwpxlib.writer.HWPXWriter;

public class Test_20260123 {
    public static void main(String[] args) throws Exception {
        HWPFile fromFile = HWPReader.fromFile("test/오류/20260123/표준정기적금규정 개정 전문.hwp");

        HWPXFile toFile = Hwp2Hwpx.toHWPX(fromFile);
        HWPXWriter.toFilepath(toFile, "test/오류/20260123/표준정기적금규정 개정 전문.hwpx");
    }
}
