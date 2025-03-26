package f3;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class k {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long b(InputStream inputStream, OutputStream outputStream) {
        return c(inputStream, outputStream, false, 1024);
    }

    public static long c(InputStream inputStream, OutputStream outputStream, boolean z7, int i8) {
        byte[] bArr = new byte[i8];
        long j8 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i8);
                if (read == -1) {
                    break;
                }
                j8 += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z7) {
                    a(inputStream);
                    a(outputStream);
                }
                throw th;
            }
        }
        if (z7) {
            a(inputStream);
            a(outputStream);
        }
        return j8;
    }

    public static byte[] d(InputStream inputStream, boolean z7) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c(inputStream, byteArrayOutputStream, z7, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
