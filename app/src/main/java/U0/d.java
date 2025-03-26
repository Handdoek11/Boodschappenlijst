package U0;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* loaded from: classes.dex */
abstract class d {

    static class a {

        /* renamed from: a, reason: collision with root package name */
        long f5332a;

        /* renamed from: b, reason: collision with root package name */
        long f5333b;

        a() {
        }
    }

    static long a(RandomAccessFile randomAccessFile, a aVar) {
        CRC32 crc32 = new CRC32();
        long j8 = aVar.f5333b;
        randomAccessFile.seek(aVar.f5332a);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j8));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j8 -= read;
            if (j8 == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j8));
        }
        return crc32.getValue();
    }

    static a b(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length();
        long j8 = length - 22;
        if (j8 < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j9 = length - 65558;
        long j10 = j9 >= 0 ? j9 : 0L;
        int reverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(j8);
            if (randomAccessFile.readInt() == reverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                a aVar = new a();
                aVar.f5333b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                aVar.f5332a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return aVar;
            }
            j8--;
        } while (j8 >= j10);
        throw new ZipException("End Of Central Directory signature not found");
    }

    static long c(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return a(randomAccessFile, b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
