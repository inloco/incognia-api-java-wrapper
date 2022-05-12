package com.incognia.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ReasonCode {
  ENVIRONMENT_LINKED_TO_MPOS_FRAUD("environment_linked_to_mpos_fraud"),
  HIGH_DENSITY_LOCATION("high_density_location"),
  MULTIPLE_ACCOUNTS("multiple_accounts"),
  MULTIPLE_INSTALLATIONS("multiple_installations"),
  MULTIPLE_ADDRESS_ZIP_CODES("multiple_address_zip_codes"),
  MULTIPLE_ADDRESS_STREETS("multiple_address_streets"),
  MULTIPLE_ADDRESS_CITIES("multiple_address_cities"),
  SDK_TAMPERING("sdk_tampering"),
  RECENT_HIGH_RISK_ACCOUNT("recent_high_risk_account"),
  MACHINE_LEARNING_MODEL("machine_learning_model"),
  LOCATION_FINGERPRINT_MATCH("location_fingerprint_match"),
  DEVICE_LINKED_TO_MPOS_FRAUD("device_linked_to_mpos_fraud"),
  VERIFIED("verified"),
  SIGNUP_ACCEPTED("signup_accepted"),
  SIGNUP_DECLINED("signup_declined"),
  IDENTITY_FRAUD("identity_fraud"),
  MPOS_FRAUD("mpos_fraud"),
  PAYMENT_ACCEPTED("payment_accepted"),
  PAYMENT_ACCEPTED_BY_THIRD_PARTY("payment_accepted_by_third_party"),
  PAYMENT_ACCEPTED_BY_CONTROL_GROUP("payment_accepted_by_control_group"),
  PAYMENT_DECLINED("payment_declined"),
  PAYMENT_DECLINED_BY_RISK_ANALYSIS("payment_declined_by_risk_analysis"),
  PAYMENT_DECLINED_BY_MANUAL_REVIEW("payment_declined_by_manual_review"),
  PAYMENT_DECLINED_BY_BUSINESS("payment_declined_by_business"),
  PAYMENT_DECLINED_BY_ACQUIRER("payment_declined_by_acquirer"),
  LOGIN_ACCEPTED("login_accepted"),
  LOGIN_DECLINED("login_declined"),
  ACCOUNT_TAKEOVER("account_takeover"),
  CHARGEBACK_NOTIFICATION("chargeback_notification"),
  CHARGEBACK("chargeback"),
  CHALLENGE_PASSED("challenge_passed"),
  CHALLENGE_FAILED("challenge_failed"),
  PASSWORD_CHANGED_SUCCESSFULLY("password_changed_successfully"),
  PASSWORD_CHANGE_FAILED("password_change_failed"),
  PROMOTION_ABUSE("promotion_abuse"),
  ADDRESS_VERIFICATION("address_verification"),
  DEVICE_INTEGRITY("device_integrity"),
  REPORT("report"),
  TRUSTED_LOCATION("trusted_location"),
  MULTI_DEVICE_ACCOUNT("multi_device_account");

  private final String code;

  public boolean isSameAs(String code) {
    return this.code.equals(code);
  }
}