package s1;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import t1.C6789j;

/* loaded from: classes.dex */
public abstract class t {
    protected t() {
    }

    public static t d(Context context) {
        return C6789j.k(context);
    }

    public static void e(Context context, androidx.work.a aVar) {
        C6789j.e(context, aVar);
    }

    public abstract m a(String str);

    public abstract m b(List list);

    public final m c(u uVar) {
        return b(Collections.singletonList(uVar));
    }
}
