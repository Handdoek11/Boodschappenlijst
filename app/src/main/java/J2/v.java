package j2;

import android.content.Context;
import java.io.Closeable;
import r2.InterfaceC6662d;

/* loaded from: classes.dex */
abstract class v implements Closeable {

    interface a {
        v a();

        a b(Context context);
    }

    v() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d().close();
    }

    abstract InterfaceC6662d d();

    abstract u e();
}
