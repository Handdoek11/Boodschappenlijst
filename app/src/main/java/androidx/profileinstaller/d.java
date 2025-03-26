package androidx.profileinstaller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
abstract class d {
    static int a(int i8) {
        return ((i8 + 7) & (-8)) / 8;
    }

    static byte[] b(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    static RuntimeException c(String str) {
        return new IllegalStateException(str);
    }

    static byte[] d(InputStream inputStream, int i8) {
        byte[] bArr = new byte[i8];
        int i9 = 0;
        while (i9 < i8) {
            int read = inputStream.read(bArr, i9, i8 - i9);
            if (read < 0) {
                throw c("Not enough bytes to read: " + i8);
            }
            i9 += read;
        }
        return bArr;
    }

    static byte[] e(InputStream inputStream, int i8, int i9) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i9];
            byte[] bArr2 = new byte[2048];
            int i10 = 0;
            int i11 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i10 < i8) {
                int read = inputStream.read(bArr2);
                if (read < 0) {
                    throw c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i8 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i11 += inflater.inflate(bArr, i11, i9 - i11);
                    i10 += read;
                } catch (DataFormatException e8) {
                    throw c(e8.getMessage());
                }
            }
            if (i10 == i8) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw c("Inflater did not finish");
            }
            throw c("Didn't read enough bytes during decompression. expected=" + i8 + " actual=" + i10);
        } finally {
            inflater.end();
        }
    }

    static String f(InputStream inputStream, int i8) {
        return new String(d(inputStream, i8), StandardCharsets.UTF_8);
    }

    static long g(InputStream inputStream, int i8) {
        byte[] d8 = d(inputStream, i8);
        long j8 = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            j8 += (d8[i9] & 255) << (i9 * 8);
        }
        return j8;
    }

    static int h(InputStream inputStream) {
        return (int) g(inputStream, 2);
    }

    static long i(InputStream inputStream) {
        return g(inputStream, 4);
    }

    static int j(InputStream inputStream) {
        return (int) g(inputStream, 1);
    }

    static int k(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    static void l(InputStream inputStream, OutputStream outputStream, FileLock fileLock) {
        if (fileLock == null || !fileLock.isValid()) {
            throw new IOException("Unable to acquire a lock on the underlying file channel.");
        }
        byte[] bArr = new byte[512];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    static void m(OutputStream outputStream, byte[] bArr) {
        q(outputStream, bArr.length);
        byte[] b8 = b(bArr);
        q(outputStream, b8.length);
        outputStream.write(b8);
    }

    static void n(OutputStream outputStream, String str) {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    static void o(OutputStream outputStream, long j8, int i8) {
        byte[] bArr = new byte[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            bArr[i9] = (byte) ((j8 >> (i9 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    static void p(OutputStream outputStream, int i8) {
        o(outputStream, i8, 2);
    }

    static void q(OutputStream outputStream, long j8) {
        o(outputStream, j8, 4);
    }

    static void r(OutputStream outputStream, int i8) {
        o(outputStream, i8, 1);
    }
}
