package androidx.work;

import android.content.Context;
import androidx.work.a;
import i1.InterfaceC5847a;
import java.util.Collections;
import java.util.List;
import s1.j;
import s1.t;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC5847a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11779a = j.f("WrkMgrInitializer");

    @Override // i1.InterfaceC5847a
    public List a() {
        return Collections.emptyList();
    }

    @Override // i1.InterfaceC5847a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public t b(Context context) {
        j.c().a(f11779a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        t.e(context, new a.b().a());
        return t.d(context);
    }
}
