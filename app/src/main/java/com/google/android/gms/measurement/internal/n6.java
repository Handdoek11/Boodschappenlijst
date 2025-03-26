package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C5032u2;
import com.google.android.gms.internal.measurement.C5052w6;

/* loaded from: classes2.dex */
final class n6 extends AbstractC5291b {

    /* renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.N1 f31117g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ h6 f31118h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n6(h6 h6Var, String str, int i8, com.google.android.gms.internal.measurement.N1 n12) {
        super(str, i8);
        this.f31118h = h6Var;
        this.f31117g = n12;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5291b
    final int a() {
        return this.f31117g.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5291b
    final boolean i() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5291b
    final boolean j() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean k(Long l8, Long l9, C5032u2 c5032u2, boolean z7) {
        byte b8 = C5052w6.a() && this.f31118h.a().F(this.f30825a, G.f30464o0);
        boolean L7 = this.f31117g.L();
        boolean M7 = this.f31117g.M();
        boolean N7 = this.f31117g.N();
        byte b9 = L7 || M7 || N7;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z7 && b9 != true) {
            this.f31118h.h().I().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f30826b), this.f31117g.O() ? Integer.valueOf(this.f31117g.k()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.L1 H7 = this.f31117g.H();
        boolean M8 = H7.M();
        if (c5032u2.Y()) {
            if (H7.O()) {
                bool = AbstractC5291b.d(AbstractC5291b.c(c5032u2.P(), H7.J()), M8);
            } else {
                this.f31118h.h().J().b("No number filter for long property. property", this.f31118h.e().g(c5032u2.U()));
            }
        } else if (c5032u2.W()) {
            if (H7.O()) {
                bool = AbstractC5291b.d(AbstractC5291b.b(c5032u2.G(), H7.J()), M8);
            } else {
                this.f31118h.h().J().b("No number filter for double property. property", this.f31118h.e().g(c5032u2.U()));
            }
        } else if (!c5032u2.a0()) {
            this.f31118h.h().J().b("User property has no value, property", this.f31118h.e().g(c5032u2.U()));
        } else if (H7.Q()) {
            bool = AbstractC5291b.d(AbstractC5291b.g(c5032u2.V(), H7.K(), this.f31118h.h()), M8);
        } else if (!H7.O()) {
            this.f31118h.h().J().b("No string or number filter defined. property", this.f31118h.e().g(c5032u2.U()));
        } else if (Z5.e0(c5032u2.V())) {
            bool = AbstractC5291b.d(AbstractC5291b.e(c5032u2.V(), H7.J()), M8);
        } else {
            this.f31118h.h().J().c("Invalid user property value for Numeric number filter. property, value", this.f31118h.e().g(c5032u2.U()), c5032u2.V());
        }
        this.f31118h.h().I().b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.f30827c = Boolean.TRUE;
        if (N7 && !bool.booleanValue()) {
            return true;
        }
        if (!z7 || this.f31117g.L()) {
            this.f30828d = bool;
        }
        if (bool.booleanValue() && b9 != false && c5032u2.Z()) {
            long R7 = c5032u2.R();
            if (l8 != null) {
                R7 = l8.longValue();
            }
            if (b8 != false && this.f31117g.L() && !this.f31117g.M() && l9 != null) {
                R7 = l9.longValue();
            }
            if (this.f31117g.M()) {
                this.f30830f = Long.valueOf(R7);
            } else {
                this.f30829e = Long.valueOf(R7);
            }
        }
        return true;
    }
}
