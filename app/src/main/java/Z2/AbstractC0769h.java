package Z2;

import X2.InterfaceC0756d;
import X2.InterfaceC0761i;
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.C1108g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: Z2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0769h extends AbstractC0765d implements a.f {

    /* renamed from: F, reason: collision with root package name */
    private final C0766e f6356F;

    /* renamed from: G, reason: collision with root package name */
    private final Set f6357G;

    /* renamed from: H, reason: collision with root package name */
    private final Account f6358H;

    protected AbstractC0769h(Context context, Looper looper, int i8, C0766e c0766e, c.a aVar, c.b bVar) {
        this(context, looper, i8, c0766e, (InterfaceC0756d) aVar, (InterfaceC0761i) bVar);
    }

    private final Set k0(Set set) {
        Set j02 = j0(set);
        Iterator it = j02.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return j02;
    }

    @Override // Z2.AbstractC0765d
    protected final Set C() {
        return this.f6357G;
    }

    @Override // com.google.android.gms.common.api.a.f
    public Set b() {
        return o() ? this.f6357G : Collections.emptySet();
    }

    @Override // Z2.AbstractC0765d
    public final Account u() {
        return this.f6358H;
    }

    @Override // Z2.AbstractC0765d
    protected Executor w() {
        return null;
    }

    protected AbstractC0769h(Context context, Looper looper, int i8, C0766e c0766e, InterfaceC0756d interfaceC0756d, InterfaceC0761i interfaceC0761i) {
        this(context, looper, AbstractC0770i.a(context), C1108g.m(), i8, c0766e, (InterfaceC0756d) r.l(interfaceC0756d), (InterfaceC0761i) r.l(interfaceC0761i));
    }

    protected AbstractC0769h(Context context, Looper looper, AbstractC0770i abstractC0770i, C1108g c1108g, int i8, C0766e c0766e, InterfaceC0756d interfaceC0756d, InterfaceC0761i interfaceC0761i) {
        super(context, looper, abstractC0770i, c1108g, i8, interfaceC0756d == null ? null : new H(interfaceC0756d), interfaceC0761i == null ? null : new I(interfaceC0761i), c0766e.h());
        this.f6356F = c0766e;
        this.f6358H = c0766e.a();
        this.f6357G = k0(c0766e.c());
    }

    protected Set j0(Set set) {
        return set;
    }
}
