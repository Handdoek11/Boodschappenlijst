package j2;

import h2.EnumC5832f;
import h2.InterfaceC5835i;
import n2.AbstractC6247a;

/* renamed from: j2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6063l {
    public static void a(InterfaceC5835i interfaceC5835i, EnumC5832f enumC5832f) {
        if (!(interfaceC5835i instanceof C6070s)) {
            AbstractC6247a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", interfaceC5835i);
        } else {
            u.c().e().u(((C6070s) interfaceC5835i).d().f(enumC5832f), 1);
        }
    }
}
