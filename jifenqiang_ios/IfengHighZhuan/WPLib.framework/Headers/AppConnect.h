#import <Foundation/Foundation.h>
#import <UIKit/UIkit.h>

#define WP_SDK_VERSION_NUMBER            @"2.3m"

@class WPUserPoints;

enum WPConnectionType {
    WP_CONNECT_TYPE_CONNECT = 0,
    WP_CONNECT_TYPE_ALT_CONNECT,
    WP_CONNECT_TYPE_USER_ID,
    WP_CONNECT_TYPE_SDK_LESS,
    WP_CONNECT_TYPE_SDK_TASK,
    WP_CONNECT_TYPE_SCHEME_INFO,
};

@interface AppConnect : NSObject {

@private
    NSString *appID_;
    NSString *userID_;
    NSString *plugin_;
    NSMutableData *data_;
    int connectAttempts_;
    BOOL isInitialConnect_;
    BOOL isAutoGetPoints_;
    int responseCode_;
    NSURLConnection *connectConnection_;
    NSURLConnection *userIDConnection_;
    NSURLConnection *SDKLessConnection_;
    NSString *appChannel_;
    NSString *appleID_;
}

@property(nonatomic, copy) NSString *appID;
@property(nonatomic, copy) NSString *appChannel;
@property(nonatomic, copy) NSString *userID;
@property(nonatomic, copy) NSString *plugin;
@property(nonatomic, copy) NSMutableDictionary *configItems;
@property(nonatomic, copy) NSString *appleID;
@property(assign) BOOL isInitialConnect;
@property(assign) BOOL isAutoGetPoints;

+ (AppConnect *)getConnect:(NSString *)appID;

+ (AppConnect *)getConnect:(NSString *)appID pid:(NSString *)appChannel;

+ (AppConnect *)getConnect:(NSString *)appID pid:(NSString *)appChannel userID:(NSString *)theUserID;

+ (AppConnect *)actionComplete:(NSString *)actionID;

+ (AppConnect *)sharedAppConnect;

+ (void)deviceNotificationReceived;

+ (NSString *)getAppID;

+ (void)setUserID:(NSString *)theUserID;

+ (NSString *)getUserID;

+ (NSMutableDictionary *)getConfigItems;

- (void)connectWithType:(int)connectionType withParams:(NSDictionary *)params;

- (NSString *)getURLStringWithConnectionType:(int)connectionType;

- (void)initiateConnectionWithConnectionType:(int)connectionType requestString:(NSString *)requestString;

- (BOOL)isJailBroken;

+ (NSString *)isJailBrokenStr;

- (NSMutableDictionary *)genericParameters;

- (NSString *)createQueryStringFromDict:(NSDictionary *)paramDict;

+ (NSString *)createQueryStringFromDict:(NSDictionary *)paramDict;

- (NSString *)createQueryStringFromString:(NSString *)string;

+ (NSString *)createQueryStringFromString:(NSString *)string;

+ (void)clearCache;

+ (NSString *)getOpenID;

+ (NSString *)getIDFA;

+ (NSString *)getIDFV;

+ (NSString *)getMACAddress;

+ (NSString *)getMACID;

+ (NSString *)getUniqueIdentifier;

+ (NSString *)getTimeStamp;

+ (NSString*) getOpenIDFA;

+ (void)autoGetPoints:(BOOL)isAuto;

@end
#import "AppConnectConstants.h"