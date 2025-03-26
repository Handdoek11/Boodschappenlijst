package C3;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class Y1 implements Callable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ ParcelFileDescriptor f920o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ byte[] f921s;

    Y1(Z1 z12, ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.f920o = parcelFileDescriptor;
        this.f921s = bArr;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        if (Log.isLoggable("WearableClient", 3)) {
            Log.d("WearableClient", "processAssets: writing data to FD : ".concat(String.valueOf(this.f920o)));
        }
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(this.f920o);
        try {
            try {
                autoCloseOutputStream.write(this.f921s);
                autoCloseOutputStream.flush();
                if (Log.isLoggable("WearableClient", 3)) {
                    Log.d("WearableClient", "processAssets: wrote data: " + String.valueOf(this.f920o));
                }
                Boolean bool = Boolean.TRUE;
                try {
                    if (Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "processAssets: closing: " + String.valueOf(this.f920o));
                    }
                    autoCloseOutputStream.close();
                    return bool;
                } catch (IOException unused) {
                    return bool;
                }
            } catch (IOException unused2) {
                Log.w("WearableClient", "processAssets: writing data failed: " + String.valueOf(this.f920o));
                try {
                    if (Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "processAssets: closing: " + String.valueOf(this.f920o));
                    }
                    autoCloseOutputStream.close();
                } catch (IOException unused3) {
                }
                return Boolean.FALSE;
            }
        } catch (Throwable th) {
            try {
                if (Log.isLoggable("WearableClient", 3)) {
                    Log.d("WearableClient", "processAssets: closing: " + String.valueOf(this.f920o));
                }
                autoCloseOutputStream.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }
}
