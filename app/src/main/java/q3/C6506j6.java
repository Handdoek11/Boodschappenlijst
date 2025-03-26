package q3;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: q3.j6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6506j6 implements InterfaceC6482g6 {

    /* renamed from: a, reason: collision with root package name */
    final List f41757a;

    public C6506j6(Context context, AbstractC6498i6 abstractC6498i6) {
        ArrayList arrayList = new ArrayList();
        this.f41757a = arrayList;
        if (abstractC6498i6.c()) {
            arrayList.add(new C6609w6(context, abstractC6498i6));
        }
    }

    @Override // q3.InterfaceC6482g6
    public final void a(InterfaceC6474f6 interfaceC6474f6) {
        Iterator it = this.f41757a.iterator();
        while (it.hasNext()) {
            ((InterfaceC6482g6) it.next()).a(interfaceC6474f6);
        }
    }
}
