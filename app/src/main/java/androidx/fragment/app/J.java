package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
final class J extends Writer {

    /* renamed from: o, reason: collision with root package name */
    private final String f9973o;

    /* renamed from: s, reason: collision with root package name */
    private StringBuilder f9974s = new StringBuilder(128);

    J(String str) {
        this.f9973o = str;
    }

    private void d() {
        if (this.f9974s.length() > 0) {
            Log.d(this.f9973o, this.f9974s.toString());
            StringBuilder sb = this.f9974s;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        d();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i8, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            char c8 = cArr[i8 + i10];
            if (c8 == '\n') {
                d();
            } else {
                this.f9974s.append(c8);
            }
        }
    }
}
