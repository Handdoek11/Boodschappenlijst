package androidx.exifinterface.media;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.util.Log;
import java.io.Closeable;
import java.io.FileDescriptor;

/* loaded from: classes.dex */
abstract class b {

    static class a {
        static void a(FileDescriptor fileDescriptor) {
            Os.close(fileDescriptor);
        }

        static FileDescriptor b(FileDescriptor fileDescriptor) {
            return Os.dup(fileDescriptor);
        }

        static long c(FileDescriptor fileDescriptor, long j8, int i8) {
            return Os.lseek(fileDescriptor, j8, i8);
        }
    }

    /* renamed from: androidx.exifinterface.media.b$b, reason: collision with other inner class name */
    static class C0163b {
        static void a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    static void a(FileDescriptor fileDescriptor) {
        try {
            a.a(fileDescriptor);
        } catch (Exception unused) {
            Log.e("ExifInterfaceUtils", "Error closing fd.");
        }
    }

    static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e8) {
                throw e8;
            } catch (Exception unused) {
            }
        }
    }

    static long[] c(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            jArr[i8] = iArr[i8];
        }
        return jArr;
    }

    static boolean d(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i8 = 0; i8 < bArr2.length; i8++) {
            if (bArr[i8] != bArr2[i8]) {
                return false;
            }
        }
        return true;
    }
}
