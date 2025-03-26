package r3;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class I implements F {

    /* renamed from: a, reason: collision with root package name */
    final List f42547a;

    public I(Context context, H h8) {
        ArrayList arrayList = new ArrayList();
        this.f42547a = arrayList;
        if (h8.c()) {
            arrayList.add(new Q(context, h8));
        }
    }
}
