package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes.dex */
final class Ev0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque f15025a = new ArrayDeque();

    /* synthetic */ Ev0(Gv0 gv0) {
    }

    static /* bridge */ /* synthetic */ AbstractC3542nu0 a(Ev0 ev0, AbstractC3542nu0 abstractC3542nu0, AbstractC3542nu0 abstractC3542nu02) {
        ev0.b(abstractC3542nu0);
        ev0.b(abstractC3542nu02);
        AbstractC3542nu0 abstractC3542nu03 = (AbstractC3542nu0) ev0.f15025a.pop();
        while (!ev0.f15025a.isEmpty()) {
            abstractC3542nu03 = new Hv0((AbstractC3542nu0) ev0.f15025a.pop(), abstractC3542nu03);
        }
        return abstractC3542nu03;
    }

    private final void b(AbstractC3542nu0 abstractC3542nu0) {
        Gv0 gv0;
        if (!abstractC3542nu0.p()) {
            if (!(abstractC3542nu0 instanceof Hv0)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(abstractC3542nu0.getClass())));
            }
            Hv0 hv0 = (Hv0) abstractC3542nu0;
            b(hv0.f15816u);
            b(hv0.f15817v);
            return;
        }
        int c8 = c(abstractC3542nu0.j());
        ArrayDeque arrayDeque = this.f15025a;
        int Q7 = Hv0.Q(c8 + 1);
        if (arrayDeque.isEmpty() || ((AbstractC3542nu0) this.f15025a.peek()).j() >= Q7) {
            this.f15025a.push(abstractC3542nu0);
            return;
        }
        int Q8 = Hv0.Q(c8);
        AbstractC3542nu0 abstractC3542nu02 = (AbstractC3542nu0) this.f15025a.pop();
        while (true) {
            gv0 = null;
            if (this.f15025a.isEmpty() || ((AbstractC3542nu0) this.f15025a.peek()).j() >= Q8) {
                break;
            } else {
                abstractC3542nu02 = new Hv0((AbstractC3542nu0) this.f15025a.pop(), abstractC3542nu02);
            }
        }
        Hv0 hv02 = new Hv0(abstractC3542nu02, abstractC3542nu0);
        while (!this.f15025a.isEmpty()) {
            int c9 = c(hv02.j()) + 1;
            ArrayDeque arrayDeque2 = this.f15025a;
            if (((AbstractC3542nu0) arrayDeque2.peek()).j() >= Hv0.Q(c9)) {
                break;
            } else {
                hv02 = new Hv0((AbstractC3542nu0) this.f15025a.pop(), hv02);
            }
        }
        this.f15025a.push(hv02);
    }

    private static final int c(int i8) {
        int binarySearch = Arrays.binarySearch(Hv0.f15814y, i8);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
