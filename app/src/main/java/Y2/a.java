package Y2;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class a implements b {

    /* renamed from: o, reason: collision with root package name */
    protected final DataHolder f6062o;

    protected a(DataHolder dataHolder) {
        this.f6062o = dataHolder;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d();
    }

    @Override // W2.e
    public void d() {
        DataHolder dataHolder = this.f6062o;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new c(this);
    }
}
