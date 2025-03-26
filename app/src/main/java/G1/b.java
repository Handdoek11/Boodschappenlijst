package g1;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes.dex */
public interface b extends Closeable {
    void P();

    void Q(String str, Object[] objArr);

    Cursor W(String str);

    void Y();

    Cursor d0(e eVar);

    String i0();

    boolean k0();

    void n();

    Cursor p(e eVar, CancellationSignal cancellationSignal);

    boolean s();

    List t();

    void v(String str);

    f y(String str);
}
