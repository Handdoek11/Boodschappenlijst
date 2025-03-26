package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* renamed from: com.google.android.gms.internal.ads.cc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2309cc {

    /* renamed from: a, reason: collision with root package name */
    private final int f21240a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC1998Zb f21241b = new C2526ec();

    public C2309cc(int i8) {
        this.f21240a = i8;
    }

    public final String a(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            sb.append(((String) arrayList.get(i8)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        C2201bc c2201bc = new C2201bc();
        PriorityQueue priorityQueue = new PriorityQueue(this.f21240a, new C2092ac(this));
        for (String str : split) {
            String[] b8 = AbstractC2418dc.b(str, false);
            if (b8.length != 0) {
                AbstractC2744gc.c(b8, this.f21240a, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                c2201bc.f20900b.write(this.f21241b.b(((C2635fc) it.next()).f22073b));
            } catch (IOException e8) {
                H2.p.e("Error while writing hash to byteStream", e8);
            }
        }
        return c2201bc.toString();
    }
}
