package j$.time.format;

import j$.time.ZoneOffset;
import j$.time.w;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements j$.time.temporal.t {
    @Override // j$.time.temporal.t
    public final Object a(j$.time.temporal.o oVar) {
        w wVar = (w) oVar.v(j$.time.temporal.n.k());
        if (wVar == null || (wVar instanceof ZoneOffset)) {
            return null;
        }
        return wVar;
    }
}
